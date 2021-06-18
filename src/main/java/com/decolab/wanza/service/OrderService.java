package com.decolab.wanza.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.OrderDAO;
import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.CartDTO;
import com.decolab.wanza.dto.MyPageDTO;
import com.decolab.wanza.dto.OrderDTO;
import com.decolab.wanza.dto.UserDTO;



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
	
	public int checkedOrder(CartDTO dto) {
		return dao.checkedOrder(dto);
	}
	
	public int checkedIn(CartDTO dto) {
		return dao.checkedIn(dto);
	}
	
	public int checkedOut(CartDTO dto) {
		return dao.checkedOut(dto);
	}
	
	public int changeQuantity(CartDTO dto) {
		return dao.changeQuantity(dto);
	}
	
	public List<CartDTO> getPaymentList(CartDTO dto) {
		return dao.getPaymentList(dto);
	}
	
	public int addAddress(AddressDTO dto) {		
		return dao.addAddress(dto);
	}
	
	public List<AddressDTO> getAddressList(AddressDTO dto){
		return dao.getAddressList(dto);
	}
	
	public int updateDefaultAddress(AddressDTO dto) {
		return dao.updateDefaultAddress(dto);
	}
	
	public int addOrder(OrderDTO dto) {
		return dao.addOrder(dto);
	}
	
	public int addPurchase(OrderDTO dto) {
		return dao.addPurchase(dto);
	}
	
	public int getOrderSeq(OrderDTO dto) {
		return dao.getOrderSeq(dto);
	}
	
	public int purchaseMileage(OrderDTO dto) {
		return dao.purchaseMileage(dto);
	}
	
	public List<MyPageDTO> getMyOrderStatusCount(MyPageDTO dto){
		return dao.getMyOrderStatusCount(dto);
	}
	
	public List<MyPageDTO> getMyOrderList(MyPageDTO dto){
		return dao.getMyOrderList(dto);
	}
	
	public List<MyPageDTO> getOrderData(MyPageDTO dto) {
		return dao.getOrderData(dto);
	}
	
	public List<MyPageDTO> getMyOrderDetail(MyPageDTO dto) {
		return dao.getMyOrderDetail(dto);
	}
	
	public AddressDTO getOrderAddress(AddressDTO dto) {
		return dao.getOrderAddress(dto);
	}
}
