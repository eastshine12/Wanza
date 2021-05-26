package com.decolab.wanza.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		// 장바구니에 이미 추가된 물품이라면
		if(service.checkCart(dto)>0) {
			return "exist";
		}
		
		System.out.println("OrderController addCart() " + new Date());		
		System.out.println(dto.toString());
			
		return service.addCart(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getCartList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CartDTO> getCartList(CartDTO dto) {
		System.out.println("OrderController getCartList() " + new Date());		
	
		return service.getCartList(dto);
	}
	
	
	@RequestMapping(value = "/deleteCart", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteCart(CartDTO dto) {
		System.out.println("OrderController deleteCart() " + new Date());		
	
		return service.deleteCart(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/checkedCart", method = {RequestMethod.GET,RequestMethod.POST})
	public String checkedCart(CartDTO dto) {
		System.out.println("OrderController checkedCart() " + new Date());		
		
		return service.checkedCart(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/goPayment", method = {RequestMethod.GET,RequestMethod.POST})
	public String goPayment(CartDTO dto, @RequestParam(value="productSeqArr[]") int[] arr) {
		System.out.println("OrderController goPayment() " + new Date());	
		System.out.println(Arrays.toString(arr));
		boolean b = false;
		for(int i : arr) {
			dto.setProductSeq(i);
			service.checkedCart(dto);
			b = true;
		};
		
		return b==true?"suc":"err";
	}
	
	
	
	
}
