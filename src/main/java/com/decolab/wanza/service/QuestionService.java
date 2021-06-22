package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.QuestionDAO;
import com.decolab.wanza.dto.QuestionCommentDTO;
import com.decolab.wanza.dto.QuestionDTO;

@Service
@Transactional
public class QuestionService {
	
	@Autowired
	QuestionDAO dao;
	
	public List<QuestionDTO> getAllQuestionList() {
		return dao.getAllQuestionList();
	}
	
	public List<QuestionDTO> getQuestionList(QuestionDTO dto) {
		return dao.getQuestionList(dto);
	}
	
	public int getQuestionCount(QuestionDTO dto) {
		return dao.getQuestionCount(dto);
	}
	
	public List<QuestionDTO> getSearchQuestion(QuestionDTO dto) {
		return dao.getSearchQuestion(dto);
	}
	
	public int questionWrite(QuestionDTO dto) {
		return dao.questionWrite(dto);
	}
	
	public QuestionDTO questionDetail(QuestionDTO dto) {
		return dao.questionDetail(dto);
	}
	
	public int questionComment(QuestionCommentDTO dto) {
		return dao.questionComment(dto);
	}
	
	public List<QuestionCommentDTO> questionCommentList(QuestionCommentDTO dto) {
		return dao.questionCommentList(dto);
	}
	
	public int questionCommentCount(QuestionCommentDTO dto) {
		return dao.questionCommentCount(dto);
	}
	
	public int questionReadCountUp(QuestionDTO dto) {
		return dao.questionReadCountUp(dto);
	}
	
	public boolean questionCommentdel(QuestionCommentDTO dto) {
		return dao.questionCommentdel(dto);
	}
	
	public int questionCommentAnswer(QuestionCommentDTO dto){
		return dao.questionCommentAnswer(dto);
	}
	
	public boolean questionCommentAnswerStep(QuestionCommentDTO dto) {
		boolean b = dao.questionCommentAnswerStep(dto);
		return b;
	}
	
	public int deleteQuestion(QuestionDTO dto) {
		return dao.deleteQuestion(dto);
	}
}
