package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.CartDTO;


@Mapper
@Repository
public interface OrderDAO {
	
	public int addCart(CartDTO dto);
	
	public List<CartDTO> getCartList(CartDTO dto);

	
}
