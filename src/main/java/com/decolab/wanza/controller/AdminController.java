package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
import com.decolab.wanza.dto.admin.AdminDeliveryStatusDTO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;
import com.decolab.wanza.service.AdminService;
import com.google.gson.JsonObject;

import util.NewFileName;

@RestController
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value = "/getDeliveryStatusList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<AdminDeliveryStatusDTO> getDeliveryStatusList(AdminDeliveryStatusDTO dto) {
		System.out.println("AdminController getDeliveryStatusList() " + new Date());
		String sd = dto.getStartDate();
		String ed = dto.getEndDate();
		if(sd!="" && sd!=null && ed!="" && ed!=null) {			
			dto.setStartDate(sd.replace("-", "/"));
			dto.setEndDate(ed.replace("-", "/"));
		}
		System.out.println(dto.toString());
		return service.getDeliveryStatusList(dto);
	}
	
	@RequestMapping(value = "/getDeliveryStatusCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getDeliveryStatusCount(AdminDeliveryStatusDTO dto) {
		System.out.println("AdminController getDeliveryStatusCount() " + new Date());
		String sd = dto.getStartDate();
		String ed = dto.getEndDate();
		if(sd!="" && sd!=null && ed!="" && ed!=null) {			
			dto.setStartDate(sd.replace("-", "/"));
			dto.setEndDate(ed.replace("-", "/"));
		}
		System.out.println(dto.toString());
		return service.getDeliveryStatusCount(dto);
	}
	
	@RequestMapping(value = "/changeDeliveryStatus", method = {RequestMethod.GET,RequestMethod.POST})
	public String changeDeliveryStatus( @RequestParam(value="orderSeq[]") int arr[], AdminDeliveryStatusDTO dto) {
		System.out.println("AdminController changeDeliveryStatus() " + new Date());
		System.out.println(dto.toString()+","+Arrays.toString(arr));
		int chk = 0;
		for (int i : arr) {
			System.out.println(i);
			dto.setOrderSeq(i);
			chk = service.changeDeliveryStatus(dto);
			if(chk==0) {
				return "failed : index="+i+", orderSeq="+dto.getOrderSeq();
			}
		}
		return "success";
	}
	
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
	public String writeProduct(@RequestParam("fileName")MultipartFile productFileName, ProductDTO dto, HttpServletRequest req) {
		System.out.println("AdminController writeProduct() " + new Date());	

		String uploadPath = req.getServletContext().getRealPath("/upload");
		String filename = productFileName.getOriginalFilename();
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		dto.setProductFileName(newFilename);
		System.out.println(dto.toString());
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(productFileName.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}
		
		service.addProduct(dto);
		int productSeq = service.getRecentAddProductSeq();
		System.out.println(productSeq);
		dto.setProductSeq(productSeq);
		service.addProductTag(dto);
		
		
		return productSeq+"";
	}
	
	
	@RequestMapping(value = "/writeProductOption", method = {RequestMethod.GET,RequestMethod.POST})
	public String writeProductOption(@RequestBody List<ProductOptionDTO> list){
		System.out.println("AdminController writeProductOption() " + new Date());	
		//System.out.println(list);
		
		int productSeq = service.getRecentAddProductSeq();
		//System.out.println("상품번호 : "+productSeq);
	
		int opSeq = 1;
		for(int i=0; i < list.size(); i++) {
			if(i>0 && list.get(i).getOptionTitle().equals(list.get(i-1).getOptionTitle())) {
				opSeq++;
			} else {
				opSeq=1;
			}
			list.get(i).setProductSeq(productSeq);
			list.get(i).setOptionSeq(opSeq);			
			//System.out.println(list.get(i).toString());
			service.addProductOption(list.get(i));
		}
		
		return "suc";
	}
	
	@RequestMapping(value = "/uploadSummernoteImageFile", method = {RequestMethod.GET,RequestMethod.POST})
	public String uploadSummernoteImageFile(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest req)  {
		JsonObject jsonObject = new JsonObject();
		
		// 내부경로로 저장
		String uploadPath = req.getServletContext().getRealPath("/upload/");
		
		String originalFileName = multipartFile.getOriginalFilename();	//오리지날 파일명
		String extension = originalFileName.substring(originalFileName.lastIndexOf("."));	//파일 확장자
		String savedFileName = UUID.randomUUID() + extension;	//저장될 파일 명
		
		File targetFile = new File(uploadPath + savedFileName);	
		System.out.println("저장되는 경로 파일명 :"+uploadPath + savedFileName);
		try {
			InputStream fileStream = multipartFile.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile);	//파일 저장
			jsonObject.addProperty("url", "http://192.168.0.231:3000/upload/"+savedFileName); // contextroot + resources + 저장할 내부 폴더명
			jsonObject.addProperty("responseCode", "success");
				
		} catch (IOException e) {
			FileUtils.deleteQuietly(targetFile);	//저장된 파일 삭제
			jsonObject.addProperty("responseCode", "error");
			e.printStackTrace();
		}
		String a = jsonObject.toString();
		System.out.println(a);
		return a;
	}
	
	@RequestMapping(value = "/getProductQuestionList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductQuestionDTO> getProductQuestionList() {
		System.out.println("AdminController getProductQuestionList() " + new Date());		
		
		return service.getProductQuestionList();
	}
	
	
	@RequestMapping(value = "/addProductAnswer", method = {RequestMethod.GET,RequestMethod.POST})
	public String addProductAnswer(ProductQuestionDTO dto) {
		System.out.println("AdminController addProductAnswer() " + new Date());		
		
		return service.addProductAnswer(dto)>0?"suc":"err";
	}

}
