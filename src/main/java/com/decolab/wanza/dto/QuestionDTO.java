package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class QuestionDTO implements Serializable{
	
	private int questionseq;
	private String questionTitle;
	private String questionContent;
	private int questionReadcount;
	private Date questionRegDate;
	
	private String questionFileName;
	private int questionDel;
	
	public QuestionDTO() {
	}
	
	

	public QuestionDTO(int questionseq, String questionTitle, String questionContent, int questionReadcount,
			Date questionRegDate, String questionFileName, int questionDel) {
		super();
		this.questionseq = questionseq;
		this.questionTitle = questionTitle;
		this.questionContent = questionContent;
		this.questionReadcount = questionReadcount;
		this.questionRegDate = questionRegDate;
		this.questionFileName = questionFileName;
		this.questionDel = questionDel;
	}



	public int getQuestionseq() {
		return questionseq;
	}

	public void setQuestionseq(int questionseq) {
		this.questionseq = questionseq;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public int getQuestionReadcount() {
		return questionReadcount;
	}

	public void setQuestionReadcount(int questionReadcount) {
		this.questionReadcount = questionReadcount;
	}

	public Date getQuestionRegDate() {
		return questionRegDate;
	}

	public void setQuestionRegDate(Date questionRegDate) {
		this.questionRegDate = questionRegDate;
	}

	public String getQuestionFileName() {
		return questionFileName;
	}

	public void setQuestionFileName(String questionFileName) {
		this.questionFileName = questionFileName;
	}

	public int getQuestionDel() {
		return questionDel;
	}

	public void setQuestionDel(int questionDel) {
		this.questionDel = questionDel;
	}
	
	
	
}
	
	

