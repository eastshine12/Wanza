package com.decolab.wanza.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {
	
	private int addressSeq;
	private int userSeq;
	private String addressName;
	private String address;
	private String receiveUser;
	private String receivePhone;
	private int defaultAddress;
	
	private int orderSeq;
	private String orderMessage;
	
	
	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public AddressDTO(int addressSeq, int userSeq, String addressName, String address, String receiveUser,
			String receivePhone, int defaultAddress, int orderSeq, String orderMessage) {
		super();
		this.addressSeq = addressSeq;
		this.userSeq = userSeq;
		this.addressName = addressName;
		this.address = address;
		this.receiveUser = receiveUser;
		this.receivePhone = receivePhone;
		this.defaultAddress = defaultAddress;
		this.orderSeq = orderSeq;
		this.orderMessage = orderMessage;
	}



	public AddressDTO(int addressSeq, int userSeq, String addressName, String address, String receiveUser,
			String receivePhone, int defaultAddress) {
		super();
		this.addressSeq = addressSeq;
		this.userSeq = userSeq;
		this.addressName = addressName;
		this.address = address;
		this.receiveUser = receiveUser;
		this.receivePhone = receivePhone;
		this.defaultAddress = defaultAddress;
	}


	public AddressDTO(int addressSeq, int userSeq, String addressName, String address, String receiveUser,
			String receivePhone) {
		super();
		this.addressSeq = addressSeq;
		this.userSeq = userSeq;
		this.addressName = addressName;
		this.address = address;
		this.receiveUser = receiveUser;
		this.receivePhone = receivePhone;
	}



	public int getAddressSeq() {
		return addressSeq;
	}



	public void setAddressSeq(int addressSeq) {
		this.addressSeq = addressSeq;
	}



	public int getUserSeq() {
		return userSeq;
	}



	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}



	public String getAddressName() {
		return addressName;
	}



	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getReceiveUser() {
		return receiveUser;
	}



	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}



	public String getReceivePhone() {
		return receivePhone;
	}



	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}



	public int getDefaultAddress() {
		return defaultAddress;
	}



	public void setDefaultAddress(int defaultAddress) {
		this.defaultAddress = defaultAddress;
	}



	public int getOrderSeq() {
		return orderSeq;
	}



	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}



	public String getOrderMessage() {
		return orderMessage;
	}



	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}



	@Override
	public String toString() {
		return "AddressDTO [addressSeq=" + addressSeq + ", userSeq=" + userSeq + ", addressName=" + addressName
				+ ", address=" + address + ", receiveUser=" + receiveUser + ", receivePhone=" + receivePhone
				+ ", defaultAddress=" + defaultAddress + ", orderSeq=" + orderSeq + ", orderMessage=" + orderMessage
				+ "]";
	}


	

	

}
