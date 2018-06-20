package com.lol.tracer.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.lol.tracer.model.User;
import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
	SummonerService summonerService;
	
	@Override
	@Transactional
	public User registUser(String name, String tel, String summonerName) {
		
		if (tel.length() != 11) {
			return null;
		}
		
		Summoner summoner = summonerService.summonerInfo(summonerName);
		
		User user = new User();
		user.setName(name);
		user.setTel(convertTel(tel));
		user.setRegDate(new Date());
		user.setSummoner(summoner);
		userRepository.save(user);
		
		return user;
		
	}
	
	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUser(String name) {
		
		return userRepository.findByName(name);
	}
	
	@Override
	public User getUser(int userNo) {
		
		try {
			return userRepository.findOne(userNo);
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	@Transactional
	public void removeUser(String name) {

		try {
			User user = userRepository.findByName(name);
			userRepository.delete(user);
		} catch (Exception e) { }
	}
	
	public String convertTel(String tel) {
		return "+82(" + tel.substring(0,3) + ")" + tel.substring(3,7) + "-" + tel.substring(7);
	}

}
