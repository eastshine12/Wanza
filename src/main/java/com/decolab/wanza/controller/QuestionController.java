package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
