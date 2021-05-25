package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class SearchDTO implements Serializable{
	
	private int searchSeq;
	private String searchWord;
	private Date searchDate;
	
	public SearchDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SearchDTO(int searchSeq, String searchWord, Date searchDate) {
		super();
		this.searchSeq = searchSeq;
		this.searchWord = searchWord;
		this.searchDate = searchDate;
	}

	public int getSearchSeq() {
		return searchSeq;
	}

	public void setSearchSeq(int searchSeq) {
		this.searchSeq = searchSeq;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public Date getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}

	@Override
	public String toString() {
		return "SearchDTO [searchSeq=" + searchSeq + ", searchWord=" + searchWord + ", searchDate=" + searchDate + "]";
	}
	
	
}
