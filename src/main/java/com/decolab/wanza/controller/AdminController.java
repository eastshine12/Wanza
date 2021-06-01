package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;
import com.decolab.wanza.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value = "/getStoryTagList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminStoryTagDTO> getStoryTagList() {
		System.out.println("AdminController getStoryTagList() " + new Date());		
		
		return service.getStoryTagList();
	}
	
	
	@RequestMapping(value = "/getSearchProductionList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getSearchProductionList(ProductDTO dto) {
		System.out.println("AdminController getSearchProductionList() " + new Date());	
		System.out.println(dto.getSearchText());
		
		return service.getSearchProductionList(dto);
	}
	
	@RequestMapping(value = "/getProductImg", method = {RequestMethod.GET,RequestMethod.POST})
	public ProductDTO getProductImg(ProductDTO dto) {
		System.out.println("AdminController getProductImg() " + new Date());	
		
		return service.getProductImg(dto);
	}
	
	
	@RequestMapping(value = "/insertLocationTag", method = {RequestMethod.GET,RequestMethod.POST})
	public String insertLocationTag(AdminStoryTagDTO dto) {
		System.out.println("AdminController insertLocationTag() " + new Date());	
		
		return service.insertLocationTag(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getProductTag", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminStoryTagDTO> getProductTag(AdminStoryTagDTO dto) {
		System.out.println("AdminController getProductTag() " + new Date());	
		
		return service.getProductTag(dto);
	}
	
	@RequestMapping(value = "/deleteTag", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteTag(AdminStoryTagDTO dto) {
		System.out.println("AdminController deleteTag() " + new Date());	
		
		return service.deleteTag(dto)>0?"suc":"err";
	}
	
	
	
	
	

}
