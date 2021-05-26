package com.decolab.wanza.controller;

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
	
	

	@RequestMapping(value = "/goPayment", method = {RequestMethod.GET,RequestMethod.POST})
	public String goPayment(CartDTO dto, @RequestParam(value="productSeqArr[]") int[] sArr,
			 @RequestParam(value="productQuantity[]") int[] qArr) {
		System.out.println("OrderController goPayment() " + new Date());
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(qArr));
		
		boolean b = false;
		List<CartDTO> list = service.getCartList(dto);
		
		for(CartDTO c : list) {
			System.out.println(c.toString());
			int index = -1;
			for(int s : sArr) {
				index++;
				if(c.getProductSeq() == s) {	// 체크되어있다면
					service.checkedIn(c);	// 분류번호변경(1)
					c.setQuantity(qArr[index]);
					service.changeQuantity(c);	//수량변경
					b = true;
					break;
				} else {	//체크안된 상품은
					service.checkedOut(c);	// 분류번호변경(0)
				};			
			};
		};		
		return b==true?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getPaymentList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CartDTO> getPaymentList(CartDTO dto) {
		System.out.println("OrderController getPaymentList() " + new Date());		
		
		return service.getPaymentList(dto);
	}
	
	
	
	
}
