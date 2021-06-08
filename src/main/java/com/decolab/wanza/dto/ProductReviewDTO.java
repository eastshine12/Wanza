package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductReviewDTO implements Serializable {
	
	private int productRevSeq;
	private int productSeq;
	private int userSeq;
	private int purchaseSeq;
	private String productRevContent;
	private String productRevFileName;
	private Date productRevDate;
	private int productRevDel;
	private int productRevRating;
	private int productRevPageNum;
	private String nickname;
	private int ratingNum;
	
	public ProductReviewDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductReviewDTO(int productRevSeq, int productSeq, int userSeq, int purchaseSeq, String productRevContent,
			String productRevFileName, Date productRevDate, int productRevDel, int productRevRating,
			int productRevPageNum, String nickname, int ratingNum) {
		super();
		this.productRevSeq = productRevSeq;
		this.productSeq = productSeq;
		this.userSeq = userSeq;
		this.purchaseSeq = purchaseSeq;
		this.productRevContent = productRevContent;
		this.productRevFileName = productRevFileName;
		this.productRevDate = productRevDate;
		this.productRevDel = productRevDel;
		this.productRevRating = productRevRating;
		this.productRevPageNum = productRevPageNum;
		this.nickname = nickname;
		this.ratingNum = ratingNum;
	}

	public int getProductRevSeq() {
		return productRevSeq;
	}

	public void setProductRevSeq(int productRevSeq) {
		this.productRevSeq = productRevSeq;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public int getPurchaseSeq() {
		return purchaseSeq;
	}

	public void setPurchaseSeq(int purchaseSeq) {
		this.purchaseSeq = purchaseSeq;
	}

	public String getProductRevContent() {
		return productRevContent;
	}

	public void setProductRevContent(String productRevContent) {
		this.productRevContent = productRevContent;
	}

	public String getProductRevFileName() {
		return productRevFileName;
	}

	public void setProductRevFileName(String productRevFileName) {
		this.productRevFileName = productRevFileName;
	}

	public Date getProductRevDate() {
		return productRevDate;
	}

	public void setProductRevDate(Date productRevDate) {
		this.productRevDate = productRevDate;
	}

	public int getProductRevDel() {
		return productRevDel;
	}

	public void setProductRevDel(int productRevDel) {
		this.productRevDel = productRevDel;
	}

	public int getProductRevRating() {
		return productRevRating;
	}

	public void setProductRevRating(int productRevRating) {
		this.productRevRating = productRevRating;
	}

	public int getProductRevPageNum() {
		return productRevPageNum;
	}

	public void setProductRevPageNum(int productRevPageNum) {
		this.productRevPageNum = productRevPageNum;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getRatingNum() {
		return ratingNum;
	}

	public void setRatingNum(int ratingNum) {
		this.ratingNum = ratingNum;
	}

	@Override
	public String toString() {
		return "ProductReviewDTO [productRevSeq=" + productRevSeq + ", productSeq=" + productSeq + ", userSeq="
				+ userSeq + ", purchaseSeq=" + purchaseSeq + ", productRevContent=" + productRevContent
				+ ", productRevFileName=" + productRevFileName + ", productRevDate=" + productRevDate
				+ ", productRevDel=" + productRevDel + ", productRevRating=" + productRevRating + ", productRevPageNum="
				+ productRevPageNum + ", nickname=" + nickname + ", ratingNum=" + ratingNum + "]";
	}

	

	
	

}
