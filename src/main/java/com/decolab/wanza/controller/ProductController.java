package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.service.ProductService;



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
	
	@RequestMapping(value = "/getSearchProduct", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getSearchProduct(ProductDTO dto){
		System.out.println("ProductController getSearchProduct() " + new Date());
		return service.getSearchProduct(dto);
	}
	
	@RequestMapping(value = "/getProductSortList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductDTO> getProductSortList(ProductDTO dto) { //분류하여 리스트로 가져오기
		System.out.println("ProductController getProductList() " + new Date());
		System.out.println(dto.toString());
		return service.getProductSortList(dto);
	}

}
