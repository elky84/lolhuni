package com.lol.tracer.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpConnectionUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpConnectionUtil.class);
	
	/**
	 * http get for xml type;
	 * @param url
	 * @return
	 */
	public static String connectGetXml(String url) {
		
		String ret = "";
		
//		try {
//			URL connectUrl = new URL(url);
//			
//			HttpURLConnection conn = (HttpURLConnection) connectUrl.openConnection();
//	        
//	        conn.setRequestMethod("GET");
//	        
//
//	        ret = XmlParseUtil.getXmlElement(conn.getInputStream());
//	
//	        logger.debug("### ret in HttpConnectionUtil = {}", ret);
//	        
//	        conn.disconnect();
//	     
//		} catch (Exception e) {
//			logger.error("### error", e);
//		}
		
		return ret;
	}
	
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
	public static String connectPostJsonForFbMessageSend(String url, String phoneNumber, String text, String psid) {
		logger.debug("### url = {}, phoneNumber = {}, text = {}",url,phoneNumber,text);
		String ret = "";
		kf
		try {			
			StringEntity params = new StringEntity("{ \"recipient\":{\"phone_number\":\"" + phoneNumber + "\"},"
					+ "{\"id\":\"" + psid + "\"}"
					+ "\"message\":{\"text\":\"" + text +"\"}" +
                    "\"messaging_type\": \"UPDATE\"" +
                    "}", "UTF-8" );
			
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-Type", "application/json");
			post.setEntity(params);
			HttpResponse response = client.execute(post);
			
			logger.debug("### response = {}",response);
		} catch (Exception e) {
			logger.error("### error",e);
		} finally {
			
		}
		
		
		return ret;
	}
	
	/**
	 * 페이스북 메신저로 메시지 보내기 (템플릿)
	 * @param url
	 * @param phoneNumber
	 * @param text
	 * @return
	 */
	public static String connectPostJsonForFbMessageSendWithTemplate(String url,String imgUrl, String phoneNumber, String title,String subTitle, String psid) {
		logger.debug("### url = {}, phoneNumber = {}, text = {}, imgUrl = {}",url,phoneNumber,title,imgUrl);
		String ret = "";
		
		try {			
			StringEntity params = new StringEntity("{ \"recipient\":{\"phone_number\":\"" + phoneNumber + "\"},"
					+ "{\"id \":" + psid + "},"
					+ "\"message\":{ \"attachment\":{ "
					+ "\"type\":\"template\","
					+ "\"payload\":{"
					+ "\"template_type\":\"generic\","
					+ "\"elements\":["
					+ "{ \"title\":\"" + title + "\", "
					+ "\"image_url\":\"" +imgUrl + "\","
					+ "\"subtitle\":\"" + subTitle + "\"}]}}}}", "UTF-8" );
			
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-Type", "application/json");
			post.setEntity(params);
			HttpResponse response = client.execute(post);
			
			logger.debug("### response = {}",response);
		} catch (Exception e) {
			logger.error("### error",e);
		} finally {
			
		}
		
		
		return ret;
	}
	
	/**
	 * 페이스북 메신저로 메시지 보내기 (템플릿)
	 * @param url
	 * @param phoneNumber
	 * @param text
	 * @return
	 */
	public static String connectPostJsonForFbMessageSendWithTemplateButton(String url,String imgUrl, String phoneNumber, String title,String subTitle) {
		logger.debug("### url = {}, phoneNumber = {}, text = {}, imgUrl = {}",url,phoneNumber,title,imgUrl);
		String ret = "";
		
		try {			
			StringEntity params = new StringEntity("{ \"recipient\":{\"phone_number\":\"" + phoneNumber + "\"},"
					+ "\"message\":{ \"attachment\":{ "
					+ "\"type\":\"template\","
					+ "\"payload\":{"
					+ "\"template_type\":\"generic\","
					+ "\"elements\":["
					+ "{ \"title\":\"" + title + "\", "
					+ "\"image_url\":\"" +imgUrl + "\","
					+ "\"subtitle\":\"" + subTitle + "\", "
					+ "\"buttons\":[{"
					+ "\"type\":\"web_url\", "
					+ "\"url\":\"http://www.google.co.kr/\", "
					+ "\"title\":\"상세 정보\""
					+"}]}]}}}}", "UTF-8" );
			
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			post.setHeader("Content-Type", "application/json");
			post.setEntity(params);
			HttpResponse response = client.execute(post);
			
			logger.debug("### response = {}",response);
		} catch (Exception e) {
			logger.error("### error",e);
		} finally {
			
		}
		
		
		return ret;
	}
}
