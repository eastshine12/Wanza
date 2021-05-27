package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.CartDTO;


@Mapper
@Repository
public interface OrderDAO {
	
	public int addCart(CartDTO dto);
	
	public int checkCart(CartDTO dto);
	
	public List<CartDTO> getCartList(CartDTO dto);
	
	public int deleteCart(CartDTO dto);
	
	public int checkedIn(CartDTO dto);
	public int checkedOut(CartDTO dto);
	
	public int changeQuantity(CartDTO dto);

	public List<CartDTO> getPaymentList(CartDTO dto);

	public int addAddress(AddressDTO dto);
	
	public List<AddressDTO> getAddressList(AddressDTO dto);
	
	public int updateDefaultAddress(AddressDTO dto);
	
}
