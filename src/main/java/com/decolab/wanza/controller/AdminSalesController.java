package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.admin.AdminSalesDTO;
import com.decolab.wanza.service.AdminSalesService;

@RestController
public class AdminSalesController {
	
	@Autowired
	AdminSalesService service;
	
	@RequestMapping(value = "/graphList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminSalesDTO> graphList(AdminSalesDTO dto){

		System.out.println("AdminSalesController graphList() " + new Date());

		return service.graphList(dto);
	}
	@RequestMapping(value = "/mapList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminSalesDTO> mapList(AdminSalesDTO dto){
		System.out.println("AdminSalesController mapList() " + new Date());
		System.out.println(dto.toString());
		return service.mapList(dto);
		
	}

}
