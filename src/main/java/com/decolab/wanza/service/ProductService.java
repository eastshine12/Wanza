package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.decolab.wanza.dao.ProductDAO;
import com.decolab.wanza.dto.ProductDTO;


@Service
@Transactional
public class ProductService {

	@Autowired
	ProductDAO dao;
	
	public List<ProductDTO> getProductList(){
		return dao.getProductList();
	}

	public ProductDTO getProductDetail(ProductDTO dto) {
		return dao.getProductDetail(dto);
	}
	
	public List<ProductDTO> getSearchProduct(ProductDTO dto){
		return dao.getSearchProduct(dto);
	}
	
	public List<ProductDTO> getProductSortList(ProductDTO dto){
		return dao.getProductSortList(dto);
	}
}