package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductHashTagDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
import com.decolab.wanza.dto.ProductReviewDTO;
import com.decolab.wanza.dto.PurchaseProductDTO;



@Mapper
@Repository
public interface ProductDAO {

	public List<ProductDTO> getProductList();
	
	public ProductDTO getProductDetail(ProductDTO dto);
	
	public List<ProductOptionDTO> getProductOptionList(ProductOptionDTO dto);
	
	public List<ProductDTO> getSearchProduct(ProductDTO dto);
	
	public List<ProductDTO> getProductSortList(ProductDTO dto);
	
	public int getProductSortCount(ProductDTO dto);
	
	public PurchaseProductDTO getUserPurchase(PurchaseProductDTO dto);
	
	public int addProductReview(ProductReviewDTO dto);
	
	public int updateRating(ProductReviewDTO dto);
	
	public int updateReviewStatus(ProductReviewDTO dto);
	
	public List<ProductReviewDTO> getProductReviewList(ProductReviewDTO dto);
	
	public List<ProductReviewDTO> getProductReviewCount(ProductReviewDTO dto);
	
	public int addProductQnA(ProductQuestionDTO dto);
	
	public ProductQuestionDTO purchaseStatus(ProductQuestionDTO dto);
	
	public List<ProductQuestionDTO> getProductQnAList(ProductQuestionDTO dto);
	
	public int getProductQnACount(ProductQuestionDTO dto);
	
	public int addReviewPoint(ProductReviewDTO dto);
	
	public List<ProductHashTagDTO> getHashTagList();
}

