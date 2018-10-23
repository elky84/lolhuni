package com.lol.tracer.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpConnectionUtil {
	
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
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			ret = response.toString();
			
		} catch (Exception e) {
			logger.error("### error", e);
		}
		
		
		return ret;
	}
	
	/**
	 * http get for json type for CurrentGameInfo
	 */
	public static String connectGetJsonForLoL(String url) {
		
		String ret = "";
		
		try {
			URL connectUrl = new URL(url);
			
			HttpURLConnection conn = (HttpURLConnection) connectUrl.openConnection();
			
			conn.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			ret = response.toString();
			
		} catch (FileNotFoundException e) {
			
		} catch (Exception e) {
			logger.error("### error",e);
		}
		
		
		return ret;
	}
	
	
	
	/**
	 * 페이스북 메신저로 메시지 보내기
	 * @param url
	 * @param phoneNumber
	 * @param text
	 * @return
	 */
	public static String connectPostJsonForLineMessageSend(String url, String token, String text) {
		logger.debug("### url = {}, text = {}",url,text);
		String ret = "";

		try {			

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-Type", "application/json");
			post.addHeader("Authorization", "Bearer " + token);

			HttpResponse response = client.execute(post);
			
			logger.debug("### response = {}",response);
		} catch (Exception e) {
			logger.error("### error",e);
		} finally {
			
		}
		
		
		return ret;
	}

}
