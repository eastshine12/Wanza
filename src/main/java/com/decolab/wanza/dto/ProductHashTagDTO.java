package com.decolab.wanza.dto;

import java.io.Serializable;

public class ProductHashTagDTO implements Serializable{

	private int productSeq;
	private String hashTagName;
	
	public ProductHashTagDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductHashTagDTO(int productSeq, String hashTagName) {
		super();
		this.productSeq = productSeq;
		this.hashTagName = hashTagName;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}

	public String getHashTagName() {
		return hashTagName;
	}

	public void setHashTagName(String hashTagName) {
		this.hashTagName = hashTagName;
	}

	@Override
	public String toString() {
		return "ProductHashTagDTO [productSeq=" + productSeq + ", hashTagName=" + hashTagName + "]";
	}


	
}
