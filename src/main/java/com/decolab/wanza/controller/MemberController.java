package com.decolab.wanza.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

	@Autowired
	//MemberService service;
	
	
	@RequestMapping(value = "/test", method = {RequestMethod.GET,RequestMethod.POST})
	public String test() {
		System.out.println("test " + new Date() );
		
		
		return "test";
	}
	

	
	
	
}
