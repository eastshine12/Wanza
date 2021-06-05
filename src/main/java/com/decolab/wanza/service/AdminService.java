package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.AdminDAO;
import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;

@Service
@Transactional
public class AdminService {
	
	
	@Autowired
	AdminDAO dao;
	
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
	
	public int addProductTag(ProductDTO dto) {
		return dao.addProductTag(dto);
	}
	
	public int addProductOption(ProductOptionDTO dto) {
		return dao.addProductOption(dto);
	}
	
	public int getRecentAddProductSeq() {
		return dao.getRecentAddProductSeq();
	}

}
