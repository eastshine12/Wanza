package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class CartDTO implements Serializable {
	
	private String cartClassify;
	private int userSeq;
	private int productSeq;
	private String selectOption;
	private int quantity;
	private int price;
	private Date cartDate;
	private int cartDel;
	private String productName;
	private String productMaker;
	private String productFileName;
	
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CartDTO(String cartClassify, int userSeq, int productSeq, String selectOption, int quantity, int price,
			Date cartDate, int cartDel, String productName, String productMaker, String productFileName) {
		super();
		this.cartClassify = cartClassify;
		this.userSeq = userSeq;
		this.productSeq = productSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
		this.cartDate = cartDate;
		this.cartDel = cartDel;
		this.productName = productName;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
	}



	public CartDTO(String cartClassify, int userSeq, int productSeq, String selectOption, int quantity, int price,
			Date cartDate, int cartDel) {
		super();
		this.cartClassify = cartClassify;
		this.userSeq = userSeq;
		this.productSeq = productSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
		this.cartDate = cartDate;
		this.cartDel = cartDel;
	}

	public CartDTO(String cartClassify, int userSeq, int productSeq, String selectOption, int quantity, int price) {
		super();
		this.cartClassify = cartClassify;
		this.userSeq = userSeq;
		this.productSeq = productSeq;
		this.selectOption = selectOption;
		this.quantity = quantity;
		this.price = price;
	}

	public String getCartClassify() {
		return cartClassify;
	}

	public void setCartClassify(String cartClassify) {
		this.cartClassify = cartClassify;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
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

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}

	public int getCartDel() {
		return cartDel;
	}

	public void setCartDel(int cartDel) {
		this.cartDel = cartDel;
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


	@Override
	public String toString() {
		return "CartDTO [cartClassify=" + cartClassify + ", userSeq=" + userSeq + ", productSeq=" + productSeq
				+ ", selectOption=" + selectOption + ", quantity=" + quantity + ", price=" + price + ", cartDate="
				+ cartDate + ", cartDel=" + cartDel + ", productName=" + productName + ", productMaker=" + productMaker
				+ ", productFileName=" + productFileName + "]";
	}

	


}
