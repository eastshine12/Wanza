package com.decolab.wanza.dto.admin;

import java.io.Serializable;

public class AdminSalesDTO implements Serializable{
	private String sDate; //시작일
	private String eDate; //종료일
	private int sType;	  // 검색타입(일간, 주간, 월간, 연간)
	private int total;	  // 총 판매 금액
	private String sDay;  // ㅇ
	private String compareDate;

	private String category;
	private int quanti;
	
	private String country;
	private int count;
	
	
	
	public AdminSalesDTO() {
		// TODO Auto-generated constructor stub
	}
	
	


public AdminSalesDTO(String sDate, String eDate, int sType, int total, String sDay, String category, int quanti,
			String country, int count) {
		super();
		this.sDate = sDate;
		this.eDate = eDate;
		this.sType = sType;
		this.total = total;
		this.sDay = sDay;
		this.category = category;
		this.quanti = quanti;
		this.country = country;
		this.count = count;
	}






public AdminSalesDTO(String sDate, String eDate, String compareDate, String country) {
	super();
	this.sDate = sDate;
	this.eDate = eDate;
	this.compareDate = compareDate;
	this.country = country;
}




	public AdminSalesDTO(String sDate, String eDate, int sType, int total, String sDay, int gyunggi, int seoul,
			int incheon, int chungnam, int chungbuk, int sejong, int daejeon, int jeonbuk, int jeonnam, int gwangju,
			int jeju, int gangwon, int gyeongbuk, int gyeongnam, int daegu, int ulsan, int busan) {
		super();
		this.sDate = sDate;
		this.eDate = eDate;
		this.sType = sType;
		this.total = total;
		this.sDay = sDay;
		/*
		this.gyunggi = gyunggi;
		this.seoul = seoul;
		this.incheon = incheon;
		this.chungnam = chungnam;
		this.chungbuk = chungbuk;
		this.sejong = sejong;
		this.daejeon = daejeon;
		this.jeonbuk = jeonbuk;
		this.jeonnam = jeonnam;
		this.gwangju = gwangju;
		this.jeju = jeju;
		this.gangwon = gangwon;
		this.gyeongbuk = gyeongbuk;
		this.gyeongnam = gyeongnam;
		this.daegu = daegu;
		this.ulsan = ulsan;
		this.busan = busan;
		*/
	}

	



	public AdminSalesDTO(String sDate, String eDate, String category, int quanti) {
		super();
		this.sDate = sDate;
		this.eDate = eDate;
		this.category = category;
		this.quanti = quanti;
	}
	
	



	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getCount() {
		return count;
	}




	public void setCount(int count) {
		this.count = count;
	}




	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getQuanti() {
		return quanti;
	}



	public void setQuanti(int quanti) {
		this.quanti = quanti;
	}



	public String getsDate() {
		return sDate;
	}



	public void setsDate(String sDate) {
		this.sDate = sDate;
	}



	public String geteDate() {
		return eDate;
	}



	public void seteDate(String eDate) {
		this.eDate = eDate;
	}



	public int getsType() {
		return sType;
	}



	public void setsType(int sType) {
		this.sType = sType;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public String getsDay() {
		return sDay;
	}



	public void setsDay(String sDay) {
		this.sDay = sDay;
	}




	public String getCompareDate() {
		return compareDate;
	}




	public void setCompareDate(String compareDate) {
		this.compareDate = compareDate;
	}




	@Override
	public String toString() {
		return "AdminSalesDTO [sDate=" + sDate + ", eDate=" + eDate + ", sType=" + sType + ", total=" + total
				+ ", sDay=" + sDay + ", compareDate=" + compareDate + ", category=" + category + ", quanti=" + quanti
				+ ", country=" + country + ", count=" + count + "]";
	}



	
	


	


	
}

