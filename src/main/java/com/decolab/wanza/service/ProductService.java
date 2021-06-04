package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.decolab.wanza.dao.ProductDAO;
import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductReviewDTO;
import com.decolab.wanza.dto.PurchaseProductDTO;


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
	
	public PurchaseProductDTO getUserPurchase(PurchaseProductDTO dto) {
		return dao.getUserPurchase(dto);
	}
	
	public int addProductReview(ProductReviewDTO dto) {
		return dao.addProductReview(dto);
	}
	
	public int updateReviewStatus(ProductReviewDTO dto) {
		return dao.updateReviewStatus(dto);
	}
	
	public List<ProductReviewDTO> getProductReviewList(ProductReviewDTO dto) {
		return dao.getProductReviewList(dto);
	}
	
	public int getProductReviewCount(ProductReviewDTO dto) {
		return dao.getProductReviewCount(dto);
	}
	
	
	
}
