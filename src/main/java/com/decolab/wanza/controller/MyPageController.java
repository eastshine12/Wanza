package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.MyPageDTO;
import com.decolab.wanza.service.OrderService;


@RestController
public class MyPageController {
	
	@Autowired
	OrderService orderService;

	@RequestMapping(value = "/getMyOrderStatusCount", method = {RequestMethod.GET,RequestMethod.POST})
	public List<MyPageDTO> getMyOrderStatusCount(MyPageDTO dto) {
		System.out.println("MyPageController getMyOrderStatusCount() " + new Date());
		return orderService.getMyOrderStatusCount(dto);
	}
	
	@RequestMapping(value = "/getMyOrderList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<MyPageDTO> getMyOrderList(MyPageDTO dto) {
		System.out.println("MyPageController getMyOrderList() " + new Date());
		return orderService.getMyOrderList(dto);
	}
	
}
