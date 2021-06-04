package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class PurchaseProductDTO implements Serializable {
	
	private int purchaseSeq;
	private int orderSeq;
	private int productSeq;
	private int userSeq;
	private String selectOption;
	private int quantity;
	private int price;
	private Date purchaseDate;
	private int reviewStatus;
	
	public PurchaseProductDTO() {
		// TODO Auto-generated constructor stub
	}


	public PurchaseProductDTO(int purchaseSeq, int orderSeq, int productSeq, int userSeq, String selectOption,
			int quantity, int price, Date purchaseDate, int reviewStatus) {
		super();
		this.purchaseSeq = purchaseSeq;
		this.orderSeq = orderSeq;
		this.productSeq = productSeq;
		this.userSeq = userSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
		this.purchaseDate = purchaseDate;
		this.reviewStatus = reviewStatus;
	}



	public int getPurchaseSeq() {
		return purchaseSeq;
	}

	public void setPurchaseSeq(int purchaseSeq) {
		this.purchaseSeq = purchaseSeq;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
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

	public String getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public int getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(int reviewStatus) {
		this.reviewStatus = reviewStatus;
	}


	@Override
	public String toString() {
		return "PurchaseProductDTO [purchaseSeq=" + purchaseSeq + ", orderSeq=" + orderSeq + ", productSeq="
				+ productSeq + ", userSeq=" + userSeq + ", selectOption=" + selectOption + ", quantity=" + quantity
				+ ", price=" + price + ", purchaseDate=" + purchaseDate + ", reviewStatus=" + reviewStatus + "]";
	}



	
	

}
