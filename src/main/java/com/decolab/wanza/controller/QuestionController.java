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

import com.decolab.wanza.dto.QuestionCommentDTO;
import com.decolab.wanza.dto.QuestionDTO;
import com.decolab.wanza.service.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionService service;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value = "/getAllQuestionList", method = {RequestMethod.GET,RequestMethod.POST} )
	public List<QuestionDTO> getAllQuestionList(){
		System.out.println("QuestionController getAllQuestionList()" + new Date());
		//System.out.println(service.getAllQuestionList());
		return service.getAllQuestionList();
	}
	
	@RequestMapping(value = "/questionWrite", method = {RequestMethod.GET,RequestMethod.POST} )
	public String questionWrite(
			/* @RequestParam("questionFile")MultipartFile uploadFile, */HttpServletRequest req, QuestionDTO dto) {
		System.out.println("QuestionController questionWrite()" + new Date());
		System.out.println(dto);
/*			
				// 파일 경로 /src/main/webapp/upload 폴더가 없으면 만들어야함!!!
				String uploadPath = req.getServletContext().getRealPath("/upload");
				//String uploadPath = "d:\\tmp"; 
				
				String filename = uploadFile.getOriginalFilename();
				String filepath = uploadPath + File.separator + filename;
				
				System.out.println("filepath: " + filepath);
				
				try {
					BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
					os.write(uploadFile.getBytes());
					os.close();
				} catch (Exception e) {
					e.printStackTrace();
					return "file upload fail";
				}*/
//		return service.questionWrite(dto)>0?"yes":"no";

		service.questionWrite(dto);
		return "ss";

		}
	
	@RequestMapping(value = "/questionDetail", method = {RequestMethod.GET,RequestMethod.POST} )
	public QuestionDTO questionDetail(QuestionDTO dto) {
		System.out.println("QuestionController questionDetail()" + new Date());
		System.out.println(service.questionDetail(dto));
		return service.questionDetail(dto);
	}
	
	@RequestMapping(value = "/questionCommentList", method = {RequestMethod.GET,RequestMethod.POST} )
	public List<QuestionCommentDTO> questionCommentList(QuestionCommentDTO dto){
		System.out.println("QuestionController questionCommentList()" + new Date());
		System.out.println(service.questionCommentList(dto));
		
		return service.questionCommentList(dto);
	}
	
	@RequestMapping(value = "/questionComment", method = {RequestMethod.GET,RequestMethod.POST} )
	public String questionComment(QuestionCommentDTO dto, HttpServletRequest req) {
		System.out.println("QuestionController questionComment()" + new Date());
		
		
		int a = service.questionComment(dto);
		System.out.println(a);
		return "ss";
	}
	
	@RequestMapping(value = "/questionCommentCount", method = {RequestMethod.GET,RequestMethod.POST} )
	public int questionCommentCount(QuestionCommentDTO dto) {
		System.out.println("QuestionController questionCommentCount()" + new Date());
		System.out.println(service.questionCommentCount(dto));
		return service.questionCommentCount(dto);
	}
	
	@RequestMapping(value = "/questionReadCountUp", method = {RequestMethod.GET,RequestMethod.POST} )
	public int questionReadCountUp(QuestionDTO dto) {
		System.out.println("QuestionController questionReadCountUp()" + new Date());
		return service.questionReadCountUp(dto);
	}
	
	@RequestMapping(value = "/questionCommentdel", method = {RequestMethod.GET,RequestMethod.POST} )
	public boolean questionCommentdel(QuestionCommentDTO dto) {
		System.out.println("QuestionController questionCommentdel()" + new Date());
		return service.questionCommentdel(dto);
	}
	
}
