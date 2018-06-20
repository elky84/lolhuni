package com.lol.tracer.web;

import java.util.List;

import com.lol.tracer.model.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lol.tracer.service.ApiKeyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "KeyApi")
public class ApiKeyController {

	@Autowired
	ApiKeyService apiKeyService;
	
	/**
	 * api key 등록
	 * @param keyName
	 * @param keyValue
	 * @return
	 */
	@RequestMapping(value = "/apiKeys", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation("api key 등록")
	public  ResponseEntity<?> registApiKey(@RequestParam String keyName, @RequestParam String keyValue) {
		
		try {
			ApiKey apiKey = apiKeyService.registKey(keyName, keyValue);
			return new ResponseEntity<ApiKey>(apiKey,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	/**
	 * api key 수정
	 * @param keyName
	 * @param keyValue
	 * @return
	 */
	@RequestMapping(value = "/apiKeys", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation("api key 수정")
	public  ResponseEntity<?> updateApiKey(@RequestParam String keyName, @RequestParam String keyValue) {
		
		try {
			ApiKey apiKey = apiKeyService.updateKey(keyName, keyValue);
			if (apiKey != null) {
				return new ResponseEntity<ApiKey>(apiKey,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	/**
	 * api key 리스트
	 * @return
	 */
	@RequestMapping(value = "/apikeys", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("api key 리스트")
	public ResponseEntity<?> apiKeyList() {
		
		try {
			List<ApiKey> apiKeys = apiKeyService.getApiKeys();
			return new ResponseEntity<List<ApiKey>>(apiKeys,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * 키 상세 정보
	 * @param keyName
	 * @return
	 */
	@RequestMapping(value = "/apikeys/{keyName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("api key 상세정보")
	public ResponseEntity<?> apiKeyInfo(@PathVariable String keyName) {
		
		try {
			ApiKey apiKey = apiKeyService.getApiKeyByKeyName(keyName);
			if (apiKey != null) {
				return new ResponseEntity<ApiKey>(apiKey,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * api key 삭제
	 * @param keyName
	 * @return
	 */
	@RequestMapping(value = "/apikeys/{keyName}", method = RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation("api key 삭제")
	public ResponseEntity<?> removeApiKey(@PathVariable String keyName) {
		
		apiKeyService.removeApiKey(keyName);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
