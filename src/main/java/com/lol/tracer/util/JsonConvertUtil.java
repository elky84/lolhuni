package com.lol.tracer.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvertUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(JsonConvertUtil.class);
	
	public static Object jsonConvertToObject(String jsonString, Class<?> targetClass) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return mapper.readValue(jsonString, targetClass);
		} catch (Exception e) {
			logger.error("### error",e);
			return null;
		}
		
	}
}
