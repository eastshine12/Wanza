package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class MyPageDTO implements Serializable {
	
	private int orderSeq;
	private int userSeq;
	private int orderStatus;	// 주문상태 ( 0:배송준비, 1:배송중, 2: 배송완료, 3: 결제대기, 4: 결제완료, 5: 환불대기, 6: 환불완료, 7: 판매완료 )

	private int productAmount;
	private int deliveryAmount;
	private int totalAmount;
	private Date orderDate;
	private int orderStatusCount; //배송현황 갯수
	
	private int productSeq;
	private String selectOption;
	private int quantity;
	private int price;
	private int reviewStatus;
	
	private String productName;
	private String productMaker;
	private String productFileName;
	private int productDell;
	
	private int searchPeriod ; //검색조건의 기간
	
	public MyPageDTO() {
		// TODO Auto-generated constructor stub
	}

	public MyPageDTO(int orderSeq, int userSeq, int orderStatus, int productAmount, int deliveryAmount, int totalAmount,
			Date orderDate, int orderStatusCount, int productSeq, String selectOption, int quantity, int price,
			int reviewStatus, String productName, String productMaker, String productFileName, int productDell,
			int searchPeriod) {
		this.orderSeq = orderSeq;
		this.userSeq = userSeq;
		this.orderStatus = orderStatus;
		this.productAmount = productAmount;
		this.deliveryAmount = deliveryAmount;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
		this.orderStatusCount = orderStatusCount;
		this.productSeq = productSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
		this.reviewStatus = reviewStatus;
		this.productName = productName;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
		this.productDell = productDell;
		this.searchPeriod = searchPeriod;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public int getDeliveryAmount() {
		return deliveryAmount;
	}

	public void setDeliveryAmount(int deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderStatusCount() {
		return orderStatusCount;
	}

	public void setOrderStatusCount(int orderStatusCount) {
		this.orderStatusCount = orderStatusCount;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
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

	public int getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(int reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductMaker() {
		return productMaker;
	}

	public void setProductMaker(String productMaker) {
		this.productMaker = productMaker;
	}

	public String getProductFileName() {
		return productFileName;
	}

	public void setProductFileName(String productFileName) {
		this.productFileName = productFileName;
	}

	public int getProductDell() {
		return productDell;
	}

	public void setProductDell(int productDell) {
		this.productDell = productDell;
	}

	public int getSearchPeriod() {
		return searchPeriod;
	}

	public void setSearchPeriod(int searchPeriod) {
		this.searchPeriod = searchPeriod;
	}

	@Override
	public String toString() {
		return "MyPageDTO [orderSeq=" + orderSeq + ", userSeq=" + userSeq + ", orderStatus=" + orderStatus
				+ ", productAmount=" + productAmount + ", deliveryAmount=" + deliveryAmount + ", totalAmount="
				+ totalAmount + ", orderDate=" + orderDate + ", orderStatusCount=" + orderStatusCount + ", productSeq="
				+ productSeq + ", selectOption=" + selectOption + ", quantity=" + quantity + ", price=" + price
				+ ", reviewStatus=" + reviewStatus + ", productName=" + productName + ", productMaker=" + productMaker
				+ ", productFileName=" + productFileName + ", productDell=" + productDell + ", searchPeriod="
				+ searchPeriod + "]";
	}

}
