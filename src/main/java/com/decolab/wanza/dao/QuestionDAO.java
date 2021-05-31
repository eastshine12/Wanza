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
	
	public int questionWrite(QuestionDTO dto);
	
	public QuestionDTO questionDetail(QuestionDTO dto);
	
	public int questionComment(QuestionCommentDTO dto);
	
	public List<QuestionCommentDTO> questionCommentList(QuestionCommentDTO dto);
}
