package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class OrderDTO implements Serializable {
	
	private int orderSeq;
	private int userSeq;
	private int addressSeq;
	
	private int productAmount;
	private int deliveryAmount;
	private int totalAmount;
	private String amountType;
	private Date orderDate;
	private int useMileage;
	private int saveMileage;	// 주문상태 ( 0:배송준비, 1:배송중, 2: 배송완료, 3: 결제대기, 4: 결제완료, 5: 환불대기, 6: 환불완료, 7: 판매완료 )
	private int orderStatus;	// 주문상태 ( 0:결제완료, 1:상품준비, 2: 배송중, 3: 배송완료 )
	private String orderMessage;
	private String orderMessage_free;
		
	private int purchaseSeq;
	private int productSeq;
	private String selectOption;
	private int quantity;
	private int price;
	
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}


	public OrderDTO(int orderSeq, int userSeq, int addressSeq, int productAmount, int deliveryAmount, int totalAmount,
			String amountType, Date orderDate, int useMileage, int saveMileage, int orderStatus, String orderMessage,
			String orderMessage_free, int purchaseSeq, int productSeq, String selectOption, int quantity, int price) {
		super();
		this.orderSeq = orderSeq;
		this.userSeq = userSeq;
		this.addressSeq = addressSeq;
		this.productAmount = productAmount;
		this.deliveryAmount = deliveryAmount;
		this.totalAmount = totalAmount;
		this.amountType = amountType;
		this.orderDate = orderDate;
		this.useMileage = useMileage;
		this.saveMileage = saveMileage;
		this.orderStatus = orderStatus;
		this.orderMessage = orderMessage;
		this.orderMessage_free = orderMessage_free;
		this.purchaseSeq = purchaseSeq;
		this.productSeq = productSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
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

	public int getAddressSeq() {
		return addressSeq;
	}

	public void setAddressSeq(int addressSeq) {
		this.addressSeq = addressSeq;
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

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getUseMileage() {
		return useMileage;
	}

	public void setUseMileage(int useMileage) {
		this.useMileage = useMileage;
	}

	public int getSaveMileage() {
		return saveMileage;
	}

	public void setSaveMileage(int saveMileage) {
		this.saveMileage = saveMileage;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}
	
	public String getOrderMessage_free() {
		return orderMessage_free;
	}

	public void setOrderMessage_free(String orderMessage_free) {
		this.orderMessage_free = orderMessage_free;
	}

	public int getPurchaseSeq() {
		return purchaseSeq;
	}

	public void setPurchaseSeq(int purchaseSeq) {
		this.purchaseSeq = purchaseSeq;
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


	@Override
	public String toString() {
		return "OrderDTO [orderSeq=" + orderSeq + ", userSeq=" + userSeq + ", addressSeq=" + addressSeq
				+ ", productAmount=" + productAmount + ", deliveryAmount=" + deliveryAmount + ", totalAmount="
				+ totalAmount + ", amountType=" + amountType + ", orderDate=" + orderDate + ", useMileage=" + useMileage
				+ ", saveMileage=" + saveMileage + ", orderStatus=" + orderStatus + ", orderMessage=" + orderMessage
				+ ", orderMessage_free=" + orderMessage_free + ", purchaseSeq=" + purchaseSeq + ", productSeq="
				+ productSeq + ", selectOption=" + selectOption + ", quantity=" + quantity + ", price=" + price + "]";
	}


	

}
