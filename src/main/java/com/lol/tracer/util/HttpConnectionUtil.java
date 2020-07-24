package com.lol.tracer.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpConnectionUtil {

	private static final ObjectMapper objectMapper = new ObjectMapper();

	private static final Logger logger = LoggerFactory.getLogger(HttpConnectionUtil.class);

	/**
	 * http get for json type
	 */
	public static String connectGetJson(String url) {
		String ret = "";

		try {
			URL connectUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) connectUrl.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			ret = response.toString();
		} catch(FileNotFoundException e) {
			logger.debug("### Data not found.", e);
		} catch (Exception e) {
			logger.error("### error",e);
		}
		return ret;
	}

	public static String connectPostJsonForSlackMessageSend(String url, Object body) {
		try {
			String bodyString = objectMapper.writeValueAsString(body);
			logger.debug("### url = {}, body = {}", url, bodyString);

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-Type", "application/json;charset=UTF-8");
			post.setEntity(new StringEntity(bodyString,"UTF-8"));

			HttpResponse response = client.execute(post);
			
			logger.debug("### response = {}",response);
			StringWriter writer = new StringWriter();
			IOUtils.copy(response.getEntity().getContent(), writer, StandardCharsets.UTF_8.name());
			return writer.toString();
		} catch (Exception e) {
			logger.error("### error",e);
		}
		return "";
	}

}
