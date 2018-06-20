package com.lol.tracer.repository;

import com.lol.tracer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>  {

	User findByTel(String tel);
	User findByName(String name);
	
}
