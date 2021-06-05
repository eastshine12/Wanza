package com.decolab.wanza.dto;

import java.io.Serializable;

public class ProductOptionDTO implements Serializable {
	
	private int productSeq;
	private int optionSeq;
	private String optionTitle;
	private String optionContent;
	private String optionPrice;
	
	public ProductOptionDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductOptionDTO(int productSeq, int optionSeq, String optionTitle, String optionContent,
			String optionPrice) {
		super();
		this.productSeq = productSeq;
		this.optionSeq = optionSeq;
		this.optionTitle = optionTitle;
		this.optionContent = optionContent;
		this.optionPrice = optionPrice;
	}

	public int getProductSeq() {
		return productSeq;
	}

	public void setProductSeq(int productSeq) {
		this.productSeq = productSeq;
	}

	public int getOptionSeq() {
		return optionSeq;
	}

	public void setOptionSeq(int optionSeq) {
		this.optionSeq = optionSeq;
	}

	public String getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(String optionTitle) {
		this.optionTitle = optionTitle;
	}

	public String getOptionContent() {
		return optionContent;
	}

	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}

	public String getOptionPrice() {
		return optionPrice;
	}

	public void setOptionPrice(String optionPrice) {
		this.optionPrice = optionPrice;
	}

	@Override
	public String toString() {
		return "ProductOptionDTO [productSeq=" + productSeq + ", optionSeq=" + optionSeq + ", optionTitle="
				+ optionTitle + ", optionContent=" + optionContent + ", optionPrice=" + optionPrice + "]";
	}

	


}
