package com.lol.tracer.repository;

import com.lol.tracer.model.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer>{
	
	ApiKey findByKeyName(String keyName);
}
