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
		System.out.println(dto.toString()); 
		System.out.println("AdminSalesController mapList() " + new Date());
		return service.mapList(dto);
		
	}
	@RequestMapping(value = "/pieChart", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminSalesDTO> pieChart(AdminSalesDTO dto){
		System.out.println("AdminSalesController pieChart() " + new Date());
		return service.pieChart(dto);
		
	}
	@RequestMapping(value = "/salesCompare", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminSalesDTO> salesCompare(AdminSalesDTO dto){
		System.out.println(dto.toString());
		System.out.println("AdminSalesController salesCompare() " + new Date());
		return service.salesCompare(dto);
	}

}
