package com.lol.tracer.web;

import java.util.List;

import com.lol.tracer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lol.tracer.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "UserApi")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation("회원 등록")
	public ResponseEntity<?> registUser(@RequestParam String name, @RequestParam String tel, @RequestParam String summonerName) {
		
		try {
			User user = userService.registUser(name, tel, summonerName);
			
			if (user != null) {
				return new ResponseEntity<User>(user,HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}	
	
	/**
	 * 등록된 소환사 리스트
	 * @return
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("회원 리스트")
	public ResponseEntity<?> userList() {
		
		try {
			List<User> users = userService.getUsers();
			return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * 키 상세 정보
	 * @param keyName
	 * @return
	 */
	@RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("회원 상세정보")
	public ResponseEntity<?> userInfo(@PathVariable String name) {
		
		try {
			User user = userService.getUser(name);
			if (user != null) {
				return new ResponseEntity<User>(user,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * 소환사 삭제
	 * @param summonerName
	 * @return
	 */
	@RequestMapping(value = "/users/{name}", method = RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation("유저 삭제")
	public ResponseEntity<?> removeUser(@PathVariable String name) {
		
		userService.removeUser(name);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
