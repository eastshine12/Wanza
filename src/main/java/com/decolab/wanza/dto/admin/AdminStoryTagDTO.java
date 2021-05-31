package com.decolab.wanza.dto.admin;

import java.io.Serializable;
import java.util.Date;

public class AdminStoryTagDTO implements Serializable {
	
	private int cardSeq;
	private String cardTitle;
	private String cardContent;
	private int userSeq;
	private int cardReadCount;
	private Date cardDate;
	private String cardFileName;
	private int cardDel;
	private String nickName;
	private int likeCount;
	
	private int productSeq;
	private String productName;
	private String productFileName;
	
	private int locationX;
	private int locationY;
	
	private String tagColor;
	private String tagHomeType;
	private String tagStyle;
	
	
	public AdminStoryTagDTO() {
		// TODO Auto-generated constructor stub
	}


	public AdminStoryTagDTO(int cardSeq, String cardTitle, String cardContent, int userSeq, int cardReadCount,
			Date cardDate, String cardFileName, int cardDel, String nickName, int likeCount, int productSeq,
			String productName, String productFileName, int locationX, int locationY, String tagColor,
			String tagHomeType, String tagStyle) {
		super();
		this.cardSeq = cardSeq;
		this.cardTitle = cardTitle;
		this.cardContent = cardContent;
		this.userSeq = userSeq;
		this.cardReadCount = cardReadCount;
		this.cardDate = cardDate;
		this.cardFileName = cardFileName;
		this.cardDel = cardDel;
		this.nickName = nickName;
		this.likeCount = likeCount;
		this.productSeq = productSeq;
		this.productName = productName;
		this.productFileName = productFileName;
		this.locationX = locationX;
		this.locationY = locationY;
		this.tagColor = tagColor;
		this.tagHomeType = tagHomeType;
		this.tagStyle = tagStyle;
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


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public int getLikeCount() {
		return likeCount;
	}


	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}


	public int getProductSeq() {
		return productSeq;
	}


	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductFileName() {
		return productFileName;
	}


	public void setProductFileName(String productFileName) {
		this.productFileName = productFileName;
	}


	public int getLocationX() {
		return locationX;
	}


	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}


	public int getLocationY() {
		return locationY;
	}


	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}


	public String getTagColor() {
		return tagColor;
	}


	public void setTagColor(String tagColor) {
		this.tagColor = tagColor;
	}


	public String getTagHomeType() {
		return tagHomeType;
	}


	public void setTagHomeType(String tagHomeType) {
		this.tagHomeType = tagHomeType;
	}


	public String getTagStyle() {
		return tagStyle;
	}


	public void setTagStyle(String tagStyle) {
		this.tagStyle = tagStyle;
	}


	@Override
	public String toString() {
		return "AdminStoryTagDTO [cardSeq=" + cardSeq + ", cardTitle=" + cardTitle + ", cardContent=" + cardContent
				+ ", userSeq=" + userSeq + ", cardReadCount=" + cardReadCount + ", cardDate=" + cardDate
				+ ", cardFileName=" + cardFileName + ", cardDel=" + cardDel + ", nickName=" + nickName + ", likeCount="
				+ likeCount + ", productSeq=" + productSeq + ", productName=" + productName + ", productFileName="
				+ productFileName + ", locationX=" + locationX + ", locationY=" + locationY + ", tagColor=" + tagColor
				+ ", tagHomeType=" + tagHomeType + ", tagStyle=" + tagStyle + "]";
	}

	

}
