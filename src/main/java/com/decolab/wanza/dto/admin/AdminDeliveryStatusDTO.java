package com.decolab.wanza.dto.admin;

import java.io.Serializable;
import java.util.Date;

public class AdminDeliveryStatusDTO implements Serializable {
	
	private int orderSeq;
	private int purchaseStatus;
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
	
	public AdminDeliveryStatusDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdminDeliveryStatusDTO(int orderSeq, int purchaseStatus, Date orderDate, String productName,
			int productQuantity, int totalQuantity, String deliveryAddress, String userName, String nickName,
			String phone, int totalAmount, int useMileage, String amountType) {
		this.orderSeq = orderSeq;
		this.purchaseStatus = purchaseStatus;
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

	@Override
	public String toString() {
		return "AdminDeliveryStatusDTO [orderSeq=" + orderSeq + ", purchaseStatus=" + purchaseStatus + ", orderDate="
				+ orderDate + ", productName=" + productName + ", productQuantity=" + productQuantity
				+ ", totalQuantity=" + totalQuantity + ", deliveryAddress=" + deliveryAddress + ", userName=" + userName
				+ ", nickName=" + nickName + ", phone=" + phone + ", totalAmount=" + totalAmount + ", useMileage="
				+ useMileage + ", amountType=" + amountType + "]";
	}

}
