package com.decolab.wanza.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	
	private int productSeq;
	private String productName;
	private String productContent;
	private int productPrice;
	private int productDiscount;
	private String productMaker;
	private String productFileName;
	private float productRating;
	
	private String searchText;
	
	private String largeCategory;
	private String mediumCategory;
	private String smallCategory;
	

	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ProductDTO(int productSeq, String productName, String productContent, int productPrice, int productDiscount,
			String productMaker, String productFileName, float productRating, String searchText, String largeCategory,
			String mediumCategory, String smallCategory) {
		super();
		this.productSeq = productSeq;
		this.productName = productName;
		this.productContent = productContent;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
		this.productRating = productRating;
		this.searchText = searchText;
		this.largeCategory = largeCategory;
		this.mediumCategory = mediumCategory;
		this.smallCategory = smallCategory;
	}


	public ProductDTO(int productSeq, String productName, String productContent, int productPrice, int productDiscount,
			String productMaker, String productFileName, float productRating, String searchText) {
		super();
		this.productSeq = productSeq;
		this.productName = productName;
		this.productContent = productContent;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
		this.productRating = productRating;
		this.searchText = searchText;
	}


	public ProductDTO(int productSeq, String productName, String productContent, int productPrice, int productDiscount,
			String productMaker, String productFileName, float productRating) {
		super();
		this.productSeq = productSeq;
		this.productName = productName;
		this.productContent = productContent;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
		this.productRating = productRating;
	}

	public ProductDTO(String productName, String productContent, int productPrice, int productDiscount,
			String productMaker, String productFileName) {
		super();
		this.productName = productName;
		this.productContent = productContent;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productMaker = productMaker;
		this.productFileName = productFileName;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductContent() {
		return productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
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

	public float getProductRating() {
		return productRating;
	}

	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public String getLargeCategory() {
		return largeCategory;
	}
	
	public void setLargeCategory(String largeCategory) {
		this.largeCategory = largeCategory;
	}
	
	public String getMediumCategory() {
		return mediumCategory;
	}

	public void setMediumCategory(String mediumCategory) {
		this.mediumCategory = mediumCategory;
	}

	public String getSmallCategory() {
		return smallCategory;
	}

	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}


	@Override
	public String toString() {
		return "ProductDTO [productSeq=" + productSeq + ", productName=" + productName + ", productContent="
				+ productContent + ", productPrice=" + productPrice + ", productDiscount=" + productDiscount
				+ ", productMaker=" + productMaker + ", productFileName=" + productFileName + ", productRating="
				+ productRating + ", searchText=" + searchText + ", largeCategory=" + largeCategory
				+ ", mediumCategory=" + mediumCategory + ", smallCategory=" + smallCategory + "]";
	}


	

}
