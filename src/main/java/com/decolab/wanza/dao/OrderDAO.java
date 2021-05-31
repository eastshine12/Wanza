package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.CartDTO;
import com.decolab.wanza.dto.OrderDTO;


@Mapper
@Repository
public interface OrderDAO {
	
	public int addCart(CartDTO dto);
	
	public int checkCart(CartDTO dto);
	
	public List<CartDTO> getCartList(CartDTO dto);
	
	public int deleteCart(CartDTO dto);
	
	public int checkedOrder(CartDTO dto);	// 분류번호 2로 변경
	public int checkedIn(CartDTO dto);	// 분류번호 1로 변경
	public int checkedOut(CartDTO dto);	// 분류번호 0으로 변경
	
	public int changeQuantity(CartDTO dto);

	public List<CartDTO> getPaymentList(CartDTO dto);

	public int addAddress(AddressDTO dto);
	
	public List<AddressDTO> getAddressList(AddressDTO dto);
	
	public int updateDefaultAddress(AddressDTO dto);
	
	public int addOrder(OrderDTO dto);
	
	public int addPurchase(OrderDTO dto);
	
	public int getOrderSeq(OrderDTO dto);
	
	
	
}
