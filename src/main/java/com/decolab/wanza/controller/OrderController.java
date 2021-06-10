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

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.CartDTO;
import com.decolab.wanza.dto.OrderDTO;
import com.decolab.wanza.dto.PaymentDTO;
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
	
	
	@RequestMapping(value = "/addAddress", method = {RequestMethod.GET,RequestMethod.POST})
	public String addAddress(AddressDTO dto) {
		System.out.println("OrderController addAddress() " + new Date());		
		
		return service.addAddress(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/getAddressList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AddressDTO> getAddressList(AddressDTO dto) {
		System.out.println("OrderController getAddressList() " + new Date());		
		
		return service.getAddressList(dto);
	}
	
	@RequestMapping(value = "/updateDefaultAddress", method = {RequestMethod.GET,RequestMethod.POST})
	public String updateDefaultAddress(AddressDTO dto) {
		System.out.println("OrderController updateDefaultAddress() " + new Date());		
		
		return service.updateDefaultAddress(dto)>0?"suc":"err";
	}
	
	//결제버튼 클릭
	@RequestMapping(value = "/paymentAf", method = {RequestMethod.GET,RequestMethod.POST})
	public String paymentAf(PaymentDTO pDto, OrderDTO dto) {
		System.out.println("OrderController paymentAf() " + new Date());
		System.out.println(pDto.toString());
		
		//배송메시지 입력없거나, 직접 입력일 경우
		if(dto.getOrderMessage().equals("0")) {
			dto.setOrderMessage("");
		} else if(dto.getOrderMessage().equals("4")) {
			dto.setOrderMessage(dto.getOrderMessage_free());
		};
				
		
		//적립포인트 (상품금액 * 0.01)
		dto.setSaveMileage((int)Math.ceil(dto.getProductAmount()*0.01));
		
		System.out.println(dto.toString());
		int a = service.addOrder(dto);
		int b = service.purchaseMileage(dto);
		
		//OrderSeq 가져오기
		int orderSeq = service.getOrderSeq(dto);
		
		//cartstatus 1인 상품 리스트 가져오기			
		List<CartDTO> cartList = service.getPaymentList(new CartDTO("CT-"+dto.getUserSeq()));
		for(CartDTO c : cartList) {
			System.out.println(c.toString());
			//purchase_product 테이블에 DB 삽입	
			dto.setOrderSeq(orderSeq);
			dto.setProductSeq(c.getProductSeq());
			dto.setSelectOption(c.getSelectOption());
			dto.setQuantity(c.getQuantity());
			dto.setPrice(c.getPrice());
			service.addPurchase(dto);
			//cartstatus 2로 변경
			service.checkedOrder(c);
		};
		
		return a+b>0?"suc":"err";
	}
	
	
	
	
	
}
