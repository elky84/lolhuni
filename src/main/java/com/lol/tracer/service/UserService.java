package com.lol.tracer.service;

import java.util.List;

import com.lol.tracer.model.User;

public interface UserService {

	/**
	 * 유저 등록
	 * @param name
	 * @param summonerName
	 * @return
	 */
	User registerUser(String name, String summonerName);
	
	/**
	 * 유저목록
	 * @return
	 */
	List<User> getUsers();
	
	/**
	 * 유저
	 * @param name
	 * @return
	 */
	User getUser(String name);
	User getUser(int userNo);
	
	/**
	 * 유저 삭제
	 * @param name
	 */
	void removeUser(String name);
	
	
}
