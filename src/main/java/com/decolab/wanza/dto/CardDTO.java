package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class CardDTO implements Serializable {
	
	private int cardSeq;
	private String cardTitle;
	private String cardContent;
	private int userSeq;
	private int cardReadCount;
	private Date cardDate;
	private String cardFileName;
	private int cardDel;
	
	public CardDTO() {
		// TODO Auto-generated constructor stub
	}

	public CardDTO(int cardSeq, String cardTitle, String cardContent, int userSeq, int cardReadCount, Date cardDate,
			String cardFileName, int cardDel) {
		super();
		this.cardSeq = cardSeq;
		this.cardTitle = cardTitle;
		this.cardContent = cardContent;
		this.userSeq = userSeq;
		this.cardReadCount = cardReadCount;
		this.cardDate = cardDate;
		this.cardFileName = cardFileName;
		this.cardDel = cardDel;
	}

	public CardDTO(String cardTitle, String cardContent, int userSeq, String cardFileName) {
		super();
		this.cardTitle = cardTitle;
		this.cardContent = cardContent;
		this.userSeq = userSeq;
		this.cardFileName = cardFileName;
	}

	public int getCardSeq() {
		return cardSeq;
	}

	public void setCardSeq(int cardSeq) {
		this.cardSeq = cardSeq;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}

	public String getCardContent() {
		return cardContent;
	}

	public void setCardContent(String cardContent) {
		this.cardContent = cardContent;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public int getCardReadCount() {
		return cardReadCount;
	}

	public void setCardReadCount(int cardReadCount) {
		this.cardReadCount = cardReadCount;
	}

	public Date getCardDate() {
		return cardDate;
	}

	public void setCardDate(Date cardDate) {
		this.cardDate = cardDate;
	}

	public String getCardFileName() {
		return cardFileName;
	}

	public void setCardFileName(String cardFileName) {
		this.cardFileName = cardFileName;
	}

	public int getCardDel() {
		return cardDel;
	}

	public void setCardDel(int cardDel) {
		this.cardDel = cardDel;
	}

	@Override
	public String toString() {
		return "CardDTO [cardSeq=" + cardSeq + ", cardTitle=" + cardTitle + ", cardContent=" + cardContent
				+ ", userSeq=" + userSeq + ", cardReadCount=" + cardReadCount + ", cardDate=" + cardDate
				+ ", cardFileName=" + cardFileName + ", cardDel=" + cardDel + "]";
	}


}
