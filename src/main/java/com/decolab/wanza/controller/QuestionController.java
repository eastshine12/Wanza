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
		System.out.println(service.getAllQuestionList());
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
		
	
	
	
	
}
