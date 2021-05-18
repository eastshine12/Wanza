package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.ProductDTO;



@Mapper
@Repository
public interface ProductDAO {

	public List<ProductDTO> getProductList();
	
}
