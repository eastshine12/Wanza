package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;
import com.decolab.wanza.service.AdminService;

import util.NewFileName;

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
	
	
	@RequestMapping(value = "/writeProduct", method = {RequestMethod.GET,RequestMethod.POST})
	public String writeProduct(@RequestParam("fileName")MultipartFile productFileName, ProductDTO pDto, HttpServletRequest req) {
		System.out.println("AdminController writeProduct() " + new Date());	
		/* 경로	src/main/webapp/upload 폴더를 생성할 것 */
		String uploadPath = req.getServletContext().getRealPath("/upload");
		//String uploadPath = "d:\\tmp";
		
		String filename = productFileName.getOriginalFilename();
		
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		pDto.setProductFileName(newFilename);

		System.out.println(pDto.toString());
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(productFileName.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}
		
		return "suc";
	}
	
	
	@RequestMapping(value = "/writeProductOption", method = {RequestMethod.GET,RequestMethod.POST})
	public String writeProductOption(ProductOptionDTO dto) {
		System.out.println("AdminController writeProductOption() " + new Date());	
		System.out.println(dto.toString());
		
		return "suc";
	}
	

}
