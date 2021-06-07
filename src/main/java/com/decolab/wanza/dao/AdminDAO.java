package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;

@Mapper
@Repository
public interface AdminDAO {
	
	public List<AdminStoryTagDTO> getStoryTagList();
	
	public List<ProductDTO> getSearchProductionList(ProductDTO dto);
	
	public ProductDTO getProductImg(ProductDTO dto);
	
	public int insertLocationTag(AdminStoryTagDTO dto);

	public List<AdminStoryTagDTO> getProductTag(AdminStoryTagDTO dto);
	
	public int deleteTag(AdminStoryTagDTO dto);
	
	public int addProduct(ProductDTO dto);
	
	public int addProductTag(ProductDTO dto);
	
	public int addProductOption(ProductOptionDTO dto);

	public int getRecentAddProductSeq();
	
	public List<ProductQuestionDTO> getProductQuestionList();
	
	public int addProductAnswer(ProductQuestionDTO dto);
	
}
