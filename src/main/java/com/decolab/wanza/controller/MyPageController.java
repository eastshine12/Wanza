package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.MyPageDTO;
import com.decolab.wanza.service.CardService;
import com.decolab.wanza.service.OrderService;


@RestController
public class MyPageController {
	
	@Autowired
	OrderService orderService;
	@Autowired
	CardService cardService;

	@RequestMapping(value = "/getMyOrderStatusCount", method = {RequestMethod.GET,RequestMethod.POST})
	public List<MyPageDTO> getMyOrderStatusCount(MyPageDTO dto) {
		System.out.println("MyPageController getMyOrderStatusCount() " + new Date());
		System.out.println(dto.toString());
		return orderService.getMyOrderStatusCount(dto);
	}
	
	@RequestMapping(value = "/getMyOrderList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<MyPageDTO> getMyOrderList(MyPageDTO dto) {
		System.out.println("MyPageController getMyOrderList() " + new Date());
		System.out.println(dto.toString());
		return orderService.getMyOrderList(dto);
	}
	
	@RequestMapping(value = "/getMyStoryList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CardDTO> getMyStoryList(CardDTO dto) {
		System.out.println("MyPageController getMyStoryList() " + new Date());
		System.out.println(dto.toString());
		return cardService.getMyStoryList(dto);
	}
	
	@RequestMapping(value = "/getMyOrderDetail", method = {RequestMethod.GET,RequestMethod.POST})
	public List<MyPageDTO> getMyOrderDetail(MyPageDTO dto) {
		System.out.println("MyPageController getMyOrderDetail() " + new Date());
		System.out.println(dto.toString());
		return orderService.getMyOrderDetail(dto);
	}
	
}
