package com.decolab.wanza.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.OrderDAO;
import com.decolab.wanza.dto.CartDTO;



@Service
@Transactional
public class OrderService {

	@Autowired
	OrderDAO dao;
	
	
	public int addCart(CartDTO dto) {
		return dao.addCart(dto);
	}
	
	public int checkCart(CartDTO dto) {
		return dao.checkCart(dto);
	}

	public List<CartDTO> getCartList(CartDTO dto) {
		return dao.getCartList(dto);
	}
	
	public int deleteCart(CartDTO dto) {
		return dao.deleteCart(dto);
	}
	
	public int checkedCart(CartDTO dto) {
		return dao.checkedCart(dto);
	}
	
}
