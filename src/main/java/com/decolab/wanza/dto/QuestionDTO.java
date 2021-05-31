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
	
	private String userName;
	private String nickName;
	private String profileName;
	private int auth;
	//U.USERNAME, U.NICKNAME, U.PROFILENAME, U.AUTH
	
	public QuestionDTO() {
	}

	
	
	public QuestionDTO(int questionSeq, int userSeq, String questionTitle, String questionContent,
			int questionReadcount, Date questionRegDate, String questionFileName, int questionDel, String userName,
			String nickName, String profileName, int auth) {
		super();
		this.questionSeq = questionSeq;
		this.userSeq = userSeq;
		this.questionTitle = questionTitle;
		this.questionContent = questionContent;
		this.questionReadcount = questionReadcount;
		this.questionRegDate = questionRegDate;
		this.questionFileName = questionFileName;
		this.questionDel = questionDel;
		this.userName = userName;
		this.nickName = nickName;
		this.profileName = profileName;
		this.auth = auth;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
	
	

	
	
	
}
	
	

