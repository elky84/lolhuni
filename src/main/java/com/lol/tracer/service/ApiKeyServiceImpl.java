package com.lol.tracer.service;

import java.util.List;

import javax.transaction.Transactional;

import com.lol.tracer.model.ApiKey;
import com.lol.tracer.repository.ApiKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

	//private static final Logger logger = LoggerFactory.getLogger(ApiKeyServiceImpl.class);
	
	@Autowired
    ApiKeyRepository apiKeyRepository;
	
	@Override
	@Transactional
	public ApiKey registKey(String keyName, String keyValue) {
		ApiKey apiKey = new ApiKey();
	
		apiKey.setKeyName(keyName);
		apiKey.setKeyValue(keyValue);
		apiKey = apiKeyRepository.save(apiKey);
	
		return apiKey;
	}
	
	@Override
	@Transactional
	public ApiKey updateKey(String keyName, String keyValue) {
		ApiKey apiKey = apiKeyRepository.findByKeyName(keyName);
	
		apiKey.setKeyName(keyName);
		apiKey.setKeyValue(keyValue);
		apiKey = apiKeyRepository.save(apiKey);
	
		return apiKey;
	}
	
	@Override
	public List<ApiKey> getApiKeys() {
		List<ApiKey> apiKeys = apiKeyRepository.findAll();
		
		return apiKeys;
	}
	
	@Override
	public ApiKey getApiKeyByKeyName(String keyName) {
		ApiKey apiKey = apiKeyRepository.findByKeyName(keyName);
		
		return apiKey;
	}
	
	@Override
	@Transactional
	public void removeApiKey(String keyName) {
		
		try {
			ApiKey apiKey = apiKeyRepository.findByKeyName(keyName);
			apiKeyRepository.delete(apiKey);
		} catch (Exception e) {
		}
	}
}
