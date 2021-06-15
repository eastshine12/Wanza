package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductQuestionDTO implements Serializable {
	
	private int productQnASeq;
	private int productSeq;
	private int userSeq;
	private int purchaseSeq;
	private String productQContent;
	private String productAContent;
	private Date productQnADate;
	private int productQnADel;
	private int productQnAPageNum;
	private String nickname;
	private String productName;
	
	private int pageNum;
	private int selectVal1;
	private int selectVal2;
	private Date startDate;
	private Date endDate;
	private String searchText;
	

	
	public ProductQuestionDTO() {
		// TODO Auto-generated constructor stub
	}
	

	
	public ProductQuestionDTO(int productQnASeq, int productSeq, int userSeq, int purchaseSeq, String productQContent,
			String productAContent, Date productQnADate, int productQnADel, int productQnAPageNum, String nickname,
			String productName, int pageNum, int selectVal1, int selectVal2, Date startDate, Date endDate,
			String searchText) {
		super();
		this.productQnASeq = productQnASeq;
		this.productSeq = productSeq;
		this.userSeq = userSeq;
		this.purchaseSeq = purchaseSeq;
		this.productQContent = productQContent;
		this.productAContent = productAContent;
		this.productQnADate = productQnADate;
		this.productQnADel = productQnADel;
		this.productQnAPageNum = productQnAPageNum;
		this.nickname = nickname;
		this.productName = productName;
		this.pageNum = pageNum;
		this.selectVal1 = selectVal1;
		this.selectVal2 = selectVal2;
		this.startDate = startDate;
		this.endDate = endDate;
		this.searchText = searchText;
	}



	public ProductQuestionDTO(int productQnASeq, int productSeq, int userSeq, int purchaseSeq, String productQContent,
			String productAContent, Date productQnADate, int productQnADel, int productQnAPageNum, String nickname,
			String productName) {
		super();
		this.productQnASeq = productQnASeq;
		this.productSeq = productSeq;
		this.userSeq = userSeq;
		this.purchaseSeq = purchaseSeq;
		this.productQContent = productQContent;
		this.productAContent = productAContent;
		this.productQnADate = productQnADate;
		this.productQnADel = productQnADel;
		this.productQnAPageNum = productQnAPageNum;
		this.nickname = nickname;
		this.productName = productName;
	}



	public int getProductQnASeq() {
		return productQnASeq;
	}



	public void setProductQnASeq(int productQnASeq) {
		this.productQnASeq = productQnASeq;
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



	public String getProductQContent() {
		return productQContent;
	}



	public void setProductQContent(String productQContent) {
		this.productQContent = productQContent;
	}



	public String getProductAContent() {
		return productAContent;
	}



	public void setProductAContent(String productAContent) {
		this.productAContent = productAContent;
	}



	public Date getProductQnADate() {
		return productQnADate;
	}



	public void setProductQnADate(Date productQnADate) {
		this.productQnADate = productQnADate;
	}



	public int getProductQnADel() {
		return productQnADel;
	}



	public void setProductQnADel(int productQnADel) {
		this.productQnADel = productQnADel;
	}



	public int getProductQnAPageNum() {
		return productQnAPageNum;
	}



	public void setProductQnAPageNum(int productQnAPageNum) {
		this.productQnAPageNum = productQnAPageNum;
	}



	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getPageNum() {
		return pageNum;
	}



	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}



	public int getSelectVal1() {
		return selectVal1;
	}



	public void setSelectVal1(int selectVal1) {
		this.selectVal1 = selectVal1;
	}



	public int getSelectVal2() {
		return selectVal2;
	}



	public void setSelectVal2(int selectVal2) {
		this.selectVal2 = selectVal2;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getSearchText() {
		return searchText;
	}



	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}



	@Override
	public String toString() {
		return "ProductQuestionDTO [productQnASeq=" + productQnASeq + ", productSeq=" + productSeq + ", userSeq="
				+ userSeq + ", purchaseSeq=" + purchaseSeq + ", productQContent=" + productQContent
				+ ", productAContent=" + productAContent + ", productQnADate=" + productQnADate + ", productQnADel="
				+ productQnADel + ", productQnAPageNum=" + productQnAPageNum + ", nickname=" + nickname
				+ ", productName=" + productName + ", pageNum=" + pageNum + ", selectVal1=" + selectVal1
				+ ", selectVal2=" + selectVal2 + ", startDate=" + startDate + ", endDate=" + endDate + ", searchText="
				+ searchText + "]";
	}


	
	
	
	
	
}
