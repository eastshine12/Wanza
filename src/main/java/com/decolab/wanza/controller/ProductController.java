package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductReviewDTO;
import com.decolab.wanza.dto.PurchaseProductDTO;
import com.decolab.wanza.service.ProductService;

import util.NewFileName;



@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value = "/getProductList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getProductList() {
		System.out.println("ProductController getProductList() " + new Date());
		return service.getProductList();
	}
	
	@RequestMapping(value = "/getProductDetail", method = {RequestMethod.GET,RequestMethod.POST})
	public ProductDTO getProductDetail(ProductDTO dto) {
		System.out.println("ProductController getProductDetail() " + new Date());
		System.out.println(dto.toString());
		return service.getProductDetail(dto);
	}
	
	@RequestMapping(value = "/getProductOptionList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductOptionDTO> getProductOptionList(ProductOptionDTO dto) {
		System.out.println("ProductController getProductOptionList() " + new Date());
		return service.getProductOptionList(dto);
	}
	
	
	@RequestMapping(value = "/getSearchProduct", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getSearchProduct(ProductDTO dto){
		System.out.println("ProductController getSearchProduct() " + new Date());
		return service.getSearchProduct(dto);
	}
	
	@RequestMapping(value = "/getProductSortList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getProductSortList(ProductDTO dto) { //분류하여 리스트로 가져오기
		System.out.println("ProductController getProductSortList() " + new Date());
		System.out.println(dto.toString());
		return service.getProductSortList(dto);
	}
	
	@RequestMapping(value = "/getProductSortCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getProductSortCount(ProductDTO dto) { //분류한 리스트 총 갯수 가져오기
		System.out.println("ProductController getProductSortList() " + new Date());
		System.out.println(dto.toString());
		return service.getProductSortCount(dto);
	}
	
	@RequestMapping(value = "/getUserPurchase", method = {RequestMethod.GET,RequestMethod.POST})
	public PurchaseProductDTO getUserPurchase(PurchaseProductDTO dto) {
		System.out.println("ProductController getUserPurchase() " + new Date());
		System.out.println(dto.toString());
		return service.getUserPurchase(dto);
	}
	
	
	@RequestMapping(value = "/addProductReview", method = {RequestMethod.GET,RequestMethod.POST})
	public String addProductReview(@RequestParam("fileName")MultipartFile fileName, ProductReviewDTO dto,  HttpServletRequest req) {
		System.out.println("ProductController addProductReview() " + new Date());
		
		String uploadPath = req.getServletContext().getRealPath("/upload");
		String filename = fileName.getOriginalFilename();
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		dto.setProductRevFileName(newFilename);
		System.out.println(dto.toString());
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(fileName.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}
		
		int a = service.addProductReview(dto);
		int b = service.updateReviewStatus(dto);
		int c = service.updateRating(dto);
		
		return a+b+c>2?"suc":"err";
	}
	
	@RequestMapping(value = "/getProductReviewList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductReviewDTO> getProductReviewList(ProductReviewDTO dto) { 
		System.out.println("ProductController getProductReviewList() " + new Date());
		System.out.println(dto.toString());
		return service.getProductReviewList(dto);
	}
	
	@RequestMapping(value = "/getProductReviewCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getProductReviewCount(ProductReviewDTO dto) { 
		System.out.println("ProductController getProductReviewCount() " + new Date());
		System.out.println(dto.toString());
		return service.getProductReviewCount(dto);
	}
	
	
	
}
