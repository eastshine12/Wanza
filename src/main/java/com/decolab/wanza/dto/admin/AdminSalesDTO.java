package com.decolab.wanza.dto.admin;

import java.io.Serializable;

public class AdminSalesDTO implements Serializable{
	private String sDate; //시작일
	private String eDate; //종료일
	private int sType;	  // 검색타입(일간, 주간, 월간, 연간)
	private int total;	  // 총 판매 금액
	private String sDay;  // ㅇ
	/*
	// 지역 별 주문 건수
	private int gyunggi;
	private int seoul;
	private int incheon;
	private int chungnam;
	private int chungbuk;
	private int sejong;
	private int daejeon;
	private int jeonbuk;
	private int jeonnam;
	private int gwangju;
	private int jeju;
	private int gangwon;
	private int gyeongbuk;
	private int gyeongnam;
	private int daegu;
	private int ulsan;
	private int busan;
*/
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


/*
	public int getGyunggi() {
		return gyunggi;
	}



	public void setGyunggi(int gyunggi) {
		this.gyunggi = gyunggi;
	}



	public int getSeoul() {
		return seoul;
	}



	public void setSeoul(int seoul) {
		this.seoul = seoul;
	}



	public int getIncheon() {
		return incheon;
	}



	public void setIncheon(int incheon) {
		this.incheon = incheon;
	}



	public int getChungnam() {
		return chungnam;
	}



	public void setChungnam(int chungnam) {
		this.chungnam = chungnam;
	}



	public int getChungbuk() {
		return chungbuk;
	}



	public void setChungbuk(int chungbuk) {
		this.chungbuk = chungbuk;
	}



	public int getSejong() {
		return sejong;
	}



	public void setSejong(int sejong) {
		this.sejong = sejong;
	}



	public int getDaejeon() {
		return daejeon;
	}



	public void setDaejeon(int daejeon) {
		this.daejeon = daejeon;
	}



	public int getJeonbuk() {
		return jeonbuk;
	}



	public void setJeonbuk(int jeonbuk) {
		this.jeonbuk = jeonbuk;
	}



	public int getJeonnam() {
		return jeonnam;
	}



	public void setJeonnam(int jeonnam) {
		this.jeonnam = jeonnam;
	}



	public int getGwangju() {
		return gwangju;
	}



	public void setGwangju(int gwangju) {
		this.gwangju = gwangju;
	}



	public int getJeju() {
		return jeju;
	}



	public void setJeju(int jeju) {
		this.jeju = jeju;
	}



	public int getGangwon() {
		return gangwon;
	}



	public void setGangwon(int gangwon) {
		this.gangwon = gangwon;
	}



	



	public int getDaegu() {
		return daegu;
	}



	public void setDaegu(int daegu) {
		this.daegu = daegu;
	}



	public int getUlsan() {
		return ulsan;
	}



	public void setUlsan(int ulsan) {
		this.ulsan = ulsan;
	}



	public int getBusan() {
		return busan;
	}



	public void setBusan(int busan) {
		this.busan = busan;
	}



	public int getGyeongbuk() {
		return gyeongbuk;
	}



	public void setGyeongbuk(int gyeongbuk) {
		this.gyeongbuk = gyeongbuk;
	}



	public int getGyeongnam() {
		return gyeongnam;
	}



	public void setGyeongnam(int gyeongnam) {
		this.gyeongnam = gyeongnam;
	}
*/

/*
	@Override
	
	public String toString() {
		return "AdminSalesDTO [sDate=" + sDate + ", eDate=" + eDate + ", sType=" + sType + ", total=" + total
				+ ", sDay=" + sDay + ", gyunggi=" + gyunggi + ", seoul=" + seoul + ", incheon=" + incheon
				+ ", chungnam=" + chungnam + ", chungbuk=" + chungbuk + ", sejong=" + sejong + ", daejeon=" + daejeon
				+ ", jeonbuk=" + jeonbuk + ", jeonnam=" + jeonnam + ", gwangju=" + gwangju + ", jeju=" + jeju
				+ ", gangwon=" + gangwon + ", gyeongbuk=" + gyeongbuk + ", gyeongnam=" + gyeongnam + ", daegu=" + daegu
				+ ", ulsan=" + ulsan + ", busan=" + busan + "]";
	}

*/

	
	


	


	
}

