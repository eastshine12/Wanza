package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class QuestionDTO implements Serializable{
	
	private int questionSeq;
	private int userSeq;
	private String questionTitle;
	private String questionContent;
	private int questionReadcount;
	private Date questionRegDate;
	
	private String questionFileName;
	private int questionDel;
	
	private int questionRef;
	private int questionStep;
	private int questionDepth;
	
	public QuestionDTO() {
	}

	public QuestionDTO(int questionSeq, int userSeq, String questionTitle, String questionContent,
			int questionReadcount, Date questionRegDate, String questionFileName, int questionDel, int questionRef,
			int questionStep, int questionDepth) {
		super();
		this.questionSeq = questionSeq;
		this.userSeq = userSeq;
		this.questionTitle = questionTitle;
		this.questionContent = questionContent;
		this.questionReadcount = questionReadcount;
		this.questionRegDate = questionRegDate;
		this.questionFileName = questionFileName;
		this.questionDel = questionDel;
		this.questionRef = questionRef;
		this.questionStep = questionStep;
		this.questionDepth = questionDepth;
	}

	public int getQuestionSeq() {
		return questionSeq;
	}

	public void setQuestionSeq(int questionSeq) {
		this.questionSeq = questionSeq;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
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

	public int getQuestionRef() {
		return questionRef;
	}

	public void setQuestionRef(int questionRef) {
		this.questionRef = questionRef;
	}

	public int getQuestionStep() {
		return questionStep;
	}

	public void setQuestionStep(int questionStep) {
		this.questionStep = questionStep;
	}

	public int getQuestionDepth() {
		return questionDepth;
	}

	public void setQuestionDepth(int questionDepth) {
		this.questionDepth = questionDepth;
	}

	@Override
	public String toString() {
		return "QuestionDTO [questionSeq=" + questionSeq + ", userSeq=" + userSeq + ", questionTitle=" + questionTitle
				+ ", questionContent=" + questionContent + ", questionReadcount=" + questionReadcount
				+ ", questionRegDate=" + questionRegDate + ", questionFileName=" + questionFileName + ", questionDel="
				+ questionDel + ", questionRef=" + questionRef + ", questionStep=" + questionStep + ", questionDepth="
				+ questionDepth + "]";
	}
	
	
	
}
	
	

