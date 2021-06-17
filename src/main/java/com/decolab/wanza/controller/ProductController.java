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
import com.decolab.wanza.dto.ProductHashTagDTO;
import com.decolab.wanza.dto.ProductOptionDTO;
import com.decolab.wanza.dto.ProductQuestionDTO;
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

		if(filename != "" && filename != null) {
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
		} else {
			dto.setProductRevFileName(filename);
		}
		
		int a = service.addProductReview(dto);
		int b = service.updateReviewStatus(dto);
		int c = service.updateRating(dto);
		int d = service.addReviewPoint(dto);
		
		
		return a+b+c+d>3?"suc":"err";
	}
	
	
	@RequestMapping(value = "/updateProductReview", method = {RequestMethod.GET,RequestMethod.POST})
	public String updateProductReview(ProductReviewDTO dto) {
		System.out.println("ProductController updateProductQnA() " + new Date());
		System.out.println(dto.toString());
		return service.updateProductReview(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/deleteProductReview", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteProductReview(ProductReviewDTO dto) {
		System.out.println("ProductController deleteProductReview() " + new Date());
		System.out.println(dto.toString());
		
		int a = service.deleteProductReview(dto);
		int b = service.removeReviewPoint(dto);
		
		return a+b>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getProductReviewList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductReviewDTO> getProductReviewList(ProductReviewDTO dto) { 
		System.out.println("ProductController getProductReviewList() " + new Date());
		System.out.println(dto.toString());
		List<ProductReviewDTO> list = service.getProductReviewList(dto);
		for (ProductReviewDTO d : list) {
			System.out.println(d.toString());
		}
		
		return list;
	}
	
	@RequestMapping(value = "/getProductReviewCount", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductReviewDTO> getProductReviewCount(ProductReviewDTO dto) { 
		System.out.println("ProductController getProductReviewCount() " + new Date());
		System.out.println(dto.toString());
		return service.getProductReviewCount(dto);
	}
	
	@RequestMapping(value = "/addProductQnA", method = {RequestMethod.GET,RequestMethod.POST})
	public String addProductQnA(ProductQuestionDTO dto) {
		System.out.println("ProductController addProductQnA() " + new Date());

		int purchaseSeq = 0;
		ProductQuestionDTO d = service.purchaseStatus(dto);
		if(d != null) {
			purchaseSeq = d.getPurchaseSeq();
		};
		dto.setPurchaseSeq(purchaseSeq);
		System.out.println(dto.toString());
		return service.addProductQnA(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/getProductQnAList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductQuestionDTO> getProductQnAList(ProductQuestionDTO dto) {
		System.out.println("ProductController getProductQnAList() " + new Date());
		System.out.println(dto.toString());
		return service.getProductQnAList(dto);
	}
	
	@RequestMapping(value = "/getProductQnACount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getProductQnACount(ProductQuestionDTO dto) {
		System.out.println("ProductController getProductQnACount() " + new Date());
		System.out.println(dto.toString());
		return service.getProductQnACount(dto);
	}
	
	
	@RequestMapping(value = "/updateProductQnA", method = {RequestMethod.GET,RequestMethod.POST})
	public String updateProductQnA(ProductQuestionDTO dto) {
		System.out.println("ProductController updateProductQnA() " + new Date());
		System.out.println(dto.toString());
		return service.updateProductQnA(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/deleteProductQnA", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteProductQnA(ProductQuestionDTO dto) {
		System.out.println("ProductController deleteProductQnA() " + new Date());
		System.out.println(dto.toString());
		return service.deleteProductQnA(dto)>0?"suc":"err";
	}
	
	
	
	@RequestMapping(value = "/getHashTagList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<ProductHashTagDTO> getHashTagList() {
		System.out.println("ProductController getHashTagList() " + new Date());
		return service.getHashTagList();
	}
	
	
	
	
	
}
