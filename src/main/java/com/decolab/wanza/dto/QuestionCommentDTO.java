package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class QuestionCommentDTO implements Serializable{
	
	private int questionSeq;
	private int userSeq;
	private int qcSeq;
	private String qcContent;
	private Date qcRegDate;
	
	private String qcFileName;
	private int qcDel;
	
	private int qcRef;
	private int qcStep;
	private int qcDepth;
	
	private String userName;
	private String nickName;
	private int auth;
	private String profileName;
	//U.USERNAME, U.NICKNAME, U.PROFILENAME, U.AUTH
	
	public QuestionCommentDTO() {
	}
	
	public QuestionCommentDTO(int questionSeq, int userSeq, int qcSeq, String qcContent, Date qcRegDate,
			String qcFileName, int qcDel, int qcRef, int qcStep, int qcDepth, String userName, String nickName,
			int auth, String profileName) {
		super();
		this.questionSeq = questionSeq;
		this.userSeq = userSeq;
		this.qcSeq = qcSeq;
		this.qcContent = qcContent;
		this.qcRegDate = qcRegDate;
		this.qcFileName = qcFileName;
		this.qcDel = qcDel;
		this.qcRef = qcRef;
		this.qcStep = qcStep;
		this.qcDepth = qcDepth;
		this.userName = userName;
		this.nickName = nickName;
		this.auth = auth;
		this.profileName = profileName;
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

	public int getQcSeq() {
		return qcSeq;
	}

	public void setQcSeq(int qcSeq) {
		this.qcSeq = qcSeq;
	}

	public String getQcContent() {
		return qcContent;
	}

	public void setQcContent(String qcContent) {
		this.qcContent = qcContent;
	}

	public Date getQcRegDate() {
		return qcRegDate;
	}

	public void setQcRegDate(Date qcRegDate) {
		this.qcRegDate = qcRegDate;
	}

	public String getQcFileName() {
		return qcFileName;
	}

	public void setQcFileName(String qcFileName) {
		this.qcFileName = qcFileName;
	}

	public int getQcDel() {
		return qcDel;
	}

	public void setQcDel(int qcDel) {
		this.qcDel = qcDel;
	}

	public int getQcRef() {
		return qcRef;
	}

	public void setQcRef(int qcRef) {
		this.qcRef = qcRef;
	}

	public int getQcStep() {
		return qcStep;
	}

	public void setQcStep(int qcStep) {
		this.qcStep = qcStep;
	}

	public int getQcDepth() {
		return qcDepth;
	}

	public void setQcDepth(int qcDepth) {
		this.qcDepth = qcDepth;
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

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "QuestionCommentDTO [questionSeq=" + questionSeq + ", userSeq=" + userSeq + ", qcSeq=" + qcSeq
				+ ", qcContent=" + qcContent + ", qcRegDate=" + qcRegDate + ", qcFileName=" + qcFileName + ", qcDel="
				+ qcDel + ", qcRef=" + qcRef + ", qcStep=" + qcStep + ", qcDepth=" + qcDepth + ", userName=" + userName
				+ ", nickName=" + nickName + ", auth=" + auth + ", profileName=" + profileName + "]";
	}
	
	
	
	
	
}
	
	

