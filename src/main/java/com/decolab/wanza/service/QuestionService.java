package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.QuestionDAO;
import com.decolab.wanza.dto.QuestionDTO;

@Service
@Transactional
public class QuestionService {
	
	@Autowired
	QuestionDAO dao;
	
	public List<QuestionDTO> getAllQuestionList() {
		return dao.getAllQuestionList();
	}
	
	public int questionWrite(QuestionDTO dto) {
		return dao.questionWrite(dto);
	}
	
	public QuestionDTO questionDetail(QuestionDTO dto) {
		return dao.questionDetail(dto);
	}

}
