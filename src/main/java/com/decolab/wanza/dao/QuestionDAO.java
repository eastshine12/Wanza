package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.QuestionCommentDTO;
import com.decolab.wanza.dto.QuestionDTO;

@Mapper
@Repository
public interface QuestionDAO {
	
	public List<QuestionDTO> getAllQuestionList();
	public List<QuestionDTO> getQuestionList(QuestionDTO dto);
	public int getQuestionCount(QuestionDTO dto);
	
	public List<QuestionDTO> getSearchQuestion(QuestionDTO dto);
	
	public int questionWrite(QuestionDTO dto);
	
	public QuestionDTO questionDetail(QuestionDTO dto);
	
	public int questionComment(QuestionCommentDTO dto);
	
	public List<QuestionCommentDTO> questionCommentList(QuestionCommentDTO dto);
	
	public int questionCommentCount(QuestionCommentDTO dto);
	
	public int questionReadCountUp(QuestionDTO dto);
	
	public boolean questionCommentdel(QuestionCommentDTO dto);
	
	public int questionCommentAnswer(QuestionCommentDTO dto);
	
	public boolean questionCommentAnswerStep(QuestionCommentDTO dto);
	
	public List<QuestionDTO> waitForComment(QuestionCommentDTO dto);
}
