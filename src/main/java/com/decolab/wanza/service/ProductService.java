package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.decolab.wanza.dao.ProductDAO;
import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
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
	
	public List<ProductOptionDTO> getProductOptionList(ProductOptionDTO dto) {
		return dao.getProductOptionList(dto);
	}
	
	public List<ProductDTO> getSearchProduct(ProductDTO dto){
		return dao.getSearchProduct(dto);
	}
	
	public List<ProductDTO> getProductSortList(ProductDTO dto){
		return dao.getProductSortList(dto);
	}
	
	public int getProductSortCount(ProductDTO dto){
		return dao.getProductSortCount(dto);
	}
	
	public PurchaseProductDTO getUserPurchase(PurchaseProductDTO dto) {
		return dao.getUserPurchase(dto);
	}
	
	public int addProductReview(ProductReviewDTO dto) {
		return dao.addProductReview(dto);
	}
	
	public int updateRating(ProductReviewDTO dto) {
		return dao.updateRating(dto);
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
	
	public int addProductQnA(ProductQuestionDTO dto) {
		return dao.addProductQnA(dto);
	}
	
	public ProductQuestionDTO purchaseStatus(ProductQuestionDTO dto) {
		return dao.purchaseStatus(dto);
	}
	
	public List<ProductQuestionDTO> getProductQnAList(ProductQuestionDTO dto) {
		return dao.getProductQnAList(dto);
	}
	
	public int getProductQnACount(ProductQuestionDTO dto) {
		return dao.getProductQnACount(dto);
	}
	
	public int addReviewPoint(ProductReviewDTO dto) {
		return dao.addReviewPoint(dto);
	}
	
	
}
