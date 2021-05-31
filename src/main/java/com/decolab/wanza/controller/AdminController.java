package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;
import com.decolab.wanza.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value = "/getStoryTagList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminStoryTagDTO> getStoryTagList() {
		System.out.println("AdminController getStoryTagList() " + new Date());		
		
		return service.getStoryTagList();
	}
	
	
	
	
	

}
