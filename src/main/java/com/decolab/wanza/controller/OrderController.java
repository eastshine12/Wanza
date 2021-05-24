package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.CartDTO;
import com.decolab.wanza.service.OrderService;



@RestController
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value = "/addCart", method = {RequestMethod.GET,RequestMethod.POST})
	public String addCart(CartDTO dto) {
		System.out.println("OrderController addCart() " + new Date());		
		System.out.println(dto.toString());
			
		return service.addCart(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getCartList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CartDTO> getCartList(CartDTO dto) {
		System.out.println("OrderController getCartList() " + new Date());		
	
		return service.getCartList(dto);
	}
	
	
	
	
	
	
}
