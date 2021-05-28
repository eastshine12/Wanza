package com.decolab.wanza.dto.admin;

import java.io.Serializable;
import java.util.Date;

public class AdminDeliveryStatusDTO implements Serializable {
	
	private int orderSeq;
	private int purchaseStatus;
	private String productName;
	private int totalQuantity;
	private String deliveryAddress;
	private Date orderDate;
	private String userName;
	private String phone;
	private int totalAmount;
	private int useMileage;
	private String amountType;
	
	public AdminDeliveryStatusDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdminDeliveryStatusDTO(int orderSeq, int purchaseStatus, String productName, int totalQuantity,
			String deliveryAddress, Date orderDate, String userName, String phone, int totalAmount, int useMileage,
			String amountType) {
		super();
		this.orderSeq = orderSeq;
		this.purchaseStatus = purchaseStatus;
		this.productName = productName;
		this.totalQuantity = totalQuantity;
		this.deliveryAddress = deliveryAddress;
		this.orderDate = orderDate;
		this.userName = userName;
		this.phone = phone;
		this.totalAmount = totalAmount;
		this.useMileage = useMileage;
		this.amountType = amountType;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}

	public int getPurchaseStatus() {
		return purchaseStatus;
	}

	public void setPurchaseStatus(int purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public String toString() {
		return "AdminDeliveryStatusDTO [orderSeq=" + orderSeq + ", purchaseStatus=" + purchaseStatus + ", productName="
				+ productName + ", totalQuantity=" + totalQuantity + ", deliveryAddress=" + deliveryAddress
				+ ", orderDate=" + orderDate + ", userName=" + userName + ", phone=" + phone + ", totalAmount="
				+ totalAmount + ", useMileage=" + useMileage + ", amountType=" + amountType + "]";
	}
	
	

}
