package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductHashTagDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
import com.decolab.wanza.dto.admin.AdminDeliveryStatusDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;
import com.decolab.wanza.dto.admin.AdminUserManageDTO;

@Mapper
@Repository
public interface AdminDAO {
	
	public List<AdminDeliveryStatusDTO> getDeliveryStatusList(AdminDeliveryStatusDTO dto);
	
	public int getDeliveryStatusCount(AdminDeliveryStatusDTO dto);
	
	public int changeDeliveryStatus(AdminDeliveryStatusDTO dto);
		
	public List<AdminStoryTagDTO> getStoryTagList(AdminStoryTagDTO dto);
	
	public int getStoryTagCount(AdminStoryTagDTO dto);
	
	public List<ProductDTO> getSearchProductionList(ProductDTO dto);
	
	public ProductDTO getProductImg(ProductDTO dto);
	
	public int insertLocationTag(AdminStoryTagDTO dto);

	public List<AdminStoryTagDTO> getProductTag(AdminStoryTagDTO dto);
	
	public int deleteTag(AdminStoryTagDTO dto);
	
	public int addProduct(ProductDTO dto);
	
	public int deleteProduct(ProductDTO dto);
		
	public int addProductHashTag(ProductHashTagDTO dto);
	
	public int addProductTag(ProductDTO dto);
	
	public int addProductOption(ProductOptionDTO dto);

	public int getRecentAddProductSeq();
	
	public List<ProductQuestionDTO> getProductQuestionList(ProductQuestionDTO dto);
	
	public int addProductAnswer(ProductQuestionDTO dto);
	
	public int getProductAnswerCount(ProductQuestionDTO dto);
	
	public List<AdminUserManageDTO> getUserManageList(AdminUserManageDTO dto);
	
	public int getUserManageCount(AdminUserManageDTO dto);
	
	public int changeAuthNum(AdminUserManageDTO dto);
	
	
}
