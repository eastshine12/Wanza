package com.decolab.wanza.dto.admin;

import java.io.Serializable;
import java.util.Date;

public class AdminDeliveryStatusDTO implements Serializable {
	
	private int orderSeq;
	private int orderStatus;
	private Date orderDate;
	private String productName;
	private int productQuantity;
	private int totalQuantity;
	private String deliveryAddress;
	private String userName;
	private String nickName;
	private String phone;
	private int totalAmount;
	private int useMileage;
	private String amountType;
	
	private String startDate; //검색 시작일
	private String endDate;
	private String sort; //검색 분류
	private String word; //검색어
	
	private int startNum; //페이지
	private int endNum;
	
	public AdminDeliveryStatusDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdminDeliveryStatusDTO(int orderSeq, int orderStatus, Date orderDate, String productName,
			int productQuantity, int totalQuantity, String deliveryAddress, String userName, String nickName,
			String phone, int totalAmount, int useMileage, String amountType, String startDate, String endDate,
			String sort, String word, int startNum, int endNum) {
		super();
		this.orderSeq = orderSeq;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.totalQuantity = totalQuantity;
		this.deliveryAddress = deliveryAddress;
		this.userName = userName;
		this.nickName = nickName;
		this.phone = phone;
		this.totalAmount = totalAmount;
		this.useMileage = useMileage;
		this.amountType = amountType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sort = sort;
		this.word = word;
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getUseMileage() {
		return useMileage;
	}

	public void setUseMileage(int useMileage) {
		this.useMileage = useMileage;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	@Override
	public String toString() {
		return "AdminDeliveryStatusDTO [orderSeq=" + orderSeq + ", orderStatus=" + orderStatus + ", orderDate="
				+ orderDate + ", productName=" + productName + ", productQuantity=" + productQuantity
				+ ", totalQuantity=" + totalQuantity + ", deliveryAddress=" + deliveryAddress + ", userName=" + userName
				+ ", nickName=" + nickName + ", phone=" + phone + ", totalAmount=" + totalAmount + ", useMileage="
				+ useMileage + ", amountType=" + amountType + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sort=" + sort + ", word=" + word + ", startNum=" + startNum + ", endNum=" + endNum + "]";
	}

}
