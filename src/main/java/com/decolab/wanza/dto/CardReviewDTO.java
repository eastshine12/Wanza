package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class CardReviewDTO implements Serializable {

	private int cardRevSeq;
	private int cardSeq;
	private int userSeq;
	private String nickName;
	private String cardRevContent;
	private Date cardRevDate;
	private int cardRevDel;
	private int cardRevPageNum;
	private String profileName;

	public CardReviewDTO() {
		// TODO Auto-generated constructor stub
	}

	public CardReviewDTO(int cardRevSeq, int cardSeq, int userSeq, String nickName, String cardRevContent,
			Date cardRevDate, int cardRevDel, int cardRevPageNum, String profileName) {
		super();
		this.cardRevSeq = cardRevSeq;
		this.cardSeq = cardSeq;
		this.userSeq = userSeq;
		this.nickName = nickName;
		this.cardRevContent = cardRevContent;
		this.cardRevDate = cardRevDate;
		this.cardRevDel = cardRevDel;
		this.cardRevPageNum = cardRevPageNum;
		this.profileName = profileName;
	}

	public int getCardRevSeq() {
		return cardRevSeq;
	}

	public void setCardRevSeq(int cardRevSeq) {
		this.cardRevSeq = cardRevSeq;
	}

	public int getCardSeq() {
		return cardSeq;
	}

	public void setCardSeq(int cardSeq) {
		this.cardSeq = cardSeq;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCardRevContent() {
		return cardRevContent;
	}

	public void setCardRevContent(String cardRevContent) {
		this.cardRevContent = cardRevContent;
	}

	public Date getCardRevDate() {
		return cardRevDate;
	}

	public void setCardRevDate(Date cardRevDate) {
		this.cardRevDate = cardRevDate;
	}

	public int getCardRevDel() {
		return cardRevDel;
	}

	public void setCardRevDel(int cardRevDel) {
		this.cardRevDel = cardRevDel;
	}

	public int getCardRevPageNum() {
		return cardRevPageNum;
	}

	public void setCardRevPageNum(int cardRevPageNum) {
		this.cardRevPageNum = cardRevPageNum;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "CardReviewDTO [cardRevSeq=" + cardRevSeq + ", cardSeq=" + cardSeq + ", userSeq=" + userSeq
				+ ", nickName=" + nickName + ", cardRevContent=" + cardRevContent + ", cardRevDate=" + cardRevDate
				+ ", cardRevDel=" + cardRevDel + ", cardRevPageNum=" + cardRevPageNum + ", profileName=" + profileName
				+ "]";
	}

	



	
	
}
