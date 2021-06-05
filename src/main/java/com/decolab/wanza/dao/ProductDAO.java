package com.decolab.wanza.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductReviewDTO;
import com.decolab.wanza.dto.PurchaseProductDTO;



@Mapper
@Repository
public interface ProductDAO {

	public List<ProductDTO> getProductList();
	
	public ProductDTO getProductDetail(ProductDTO dto);
	
	public List<ProductDTO> getSearchProduct(ProductDTO dto);
	
	public List<ProductDTO> getProductSortList(ProductDTO dto);
	
	public PurchaseProductDTO getUserPurchase(PurchaseProductDTO dto);
	
	public int addProductReview(ProductReviewDTO dto);
	
	public int updateReviewStatus(ProductReviewDTO dto);
	
	public List<ProductReviewDTO> getProductReviewList(ProductReviewDTO dto);
	
	public int getProductReviewCount(ProductReviewDTO dto);
}
