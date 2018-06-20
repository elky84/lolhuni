package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.ApiKey;

public interface ApiKeyService {

	/**
	 * 키 등록
	 * @param keyName
	 * @param keyValue
	 * @return
	 */
	ApiKey registKey(String keyName, String keyValue);
	
	/**
	 * 키 업데이트
	 * @param keyName
	 * @param keyValue
	 * @return
	 */
	ApiKey updateKey(String keyName, String keyValue);
	
	/**
	 * 키 리스트
	 * @return
	 */
	List<ApiKey> getApiKeys();
	
	/**
	 * 키 이름으로 apiKey 찾기
	 * @param keyName
	 * @return
	 */
	ApiKey getApiKeyByKeyName(String keyName);
	
	/**
	 * 키 삭제
	 * @param keyName
	 */
	void removeApiKey(String keyName);
}
