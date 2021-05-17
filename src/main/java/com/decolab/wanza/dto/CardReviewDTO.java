package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class CardReviewDTO implements Serializable {

	private int cardRevSeq;
	private int cardSeq;
	private String nickName;
	private String cardRevContent;
	private Date cardRevDate;
	private int cardRevDel;
	private int cardRevPageNum;

	public CardReviewDTO() {
		// TODO Auto-generated constructor stub
	}

	public CardReviewDTO(int cardRevSeq, int cardSeq, String nickName, String cardRevContent, Date cardRevDate,
			int cardRevDel, int cardRevPageNum) {
		super();
		this.cardRevSeq = cardRevSeq;
		this.cardSeq = cardSeq;
		this.nickName = nickName;
		this.cardRevContent = cardRevContent;
		this.cardRevDate = cardRevDate;
		this.cardRevDel = cardRevDel;
		this.cardRevPageNum = cardRevPageNum;
	}

	public CardReviewDTO(int cardSeq, String nickName, String cardRevContent) {
		super();
		this.cardSeq = cardSeq;
		this.nickName = nickName;
		this.cardRevContent = cardRevContent;
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

	@Override
	public String toString() {
		return "CardReviewDTO [cardRevSeq=" + cardRevSeq + ", cardSeq=" + cardSeq + ", nickName=" + nickName
				+ ", cardRevContent=" + cardRevContent + ", cardRevDate=" + cardRevDate + ", cardRevDel=" + cardRevDel
				+ ", cardRevPageNum=" + cardRevPageNum + "]";
	}

	
	
}
