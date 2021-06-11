package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.AdminDAO;
import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductHashTagDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
import com.decolab.wanza.dto.admin.AdminDeliveryStatusDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;

@Service
@Transactional
public class AdminService {
	
	
	@Autowired
	AdminDAO dao;
	
	public List<AdminDeliveryStatusDTO> getDeliveryStatusList(AdminDeliveryStatusDTO dto){
		return dao.getDeliveryStatusList(dto);
	}
	
	public int getDeliveryStatusCount(AdminDeliveryStatusDTO dto){
		return dao.getDeliveryStatusCount(dto);
	}
	
	public int changeDeliveryStatus(AdminDeliveryStatusDTO dto){
		return dao.changeDeliveryStatus(dto);
	}
	
	public List<AdminStoryTagDTO> getStoryTagList(){
		return dao.getStoryTagList();
	}
	
	public List<ProductDTO> getSearchProductionList(ProductDTO dto){
		return dao.getSearchProductionList(dto);
	}
	
	public ProductDTO getProductImg(ProductDTO dto) {
		return dao.getProductImg(dto);
	}
	
	public int insertLocationTag(AdminStoryTagDTO dto) {
		return dao.insertLocationTag(dto);
	}
	
	public List<AdminStoryTagDTO> getProductTag(AdminStoryTagDTO dto) {
		return dao.getProductTag(dto);
	}
	
	public int deleteTag(AdminStoryTagDTO dto) {
		return dao.deleteTag(dto);
	}
	
	public int addProduct(ProductDTO dto) {
		return dao.addProduct(dto);
	}
	
	public int deleteProduct(ProductDTO dto) {
		return dao.deleteProduct(dto);
	}
	
	public int addProductHashTag(ProductHashTagDTO dto) {
		return dao.addProductHashTag(dto);
	}
	
	public int addProductTag(ProductDTO dto) {
		return dao.addProductTag(dto);
	}
	
	public int addProductOption(ProductOptionDTO dto) {
		return dao.addProductOption(dto);
	}
	
	public int getRecentAddProductSeq() {
		return dao.getRecentAddProductSeq();
	}
	
	public List<ProductQuestionDTO> getProductQuestionList() {
		return dao.getProductQuestionList();
	}
	
	public int addProductAnswer(ProductQuestionDTO dto) {
		return dao.addProductAnswer(dto);
	}

}
