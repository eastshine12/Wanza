package com.decolab.wanza.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.UserDTO;
import com.decolab.wanza.service.UserService;

import util.KakaoLogin;


@RestController
public class UserController {

	@Autowired
	UserService service;
	
	
	KakaoLogin Kakao;
	
	
	@RequestMapping(value = "/regi", method = {RequestMethod.GET,RequestMethod.POST})
	public String regi(UserDTO dto) {
		System.out.println("UserController regi() " + new Date() );
		System.out.println(dto.toString());
			
		return service.addUser(dto)>0?"suc":"err";
	}
	
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO login(UserDTO dto) {
		System.out.println("UserController login() " + new Date() );
		System.out.println(dto.toString());
		
		return service.login(dto);
	}
	
	
	@RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO getUserInfo(int userSeq) {
		System.out.println("UserController getUserInfo() " + new Date() );
		
		return service.getUserInfo(userSeq);
	}
	

	
	
	
}
