package com.decolab.wanza.dto.admin;

import java.io.Serializable;
import java.util.Date;

public class AdminUserManageDTO implements Serializable {
	
	private int userSeq;
	private String email;
	private String pwd;
	private String userName;
	private String nickname;
	private String profileName;
	private String phone;
	private int auth;
	private Date userDate;
	private int mileage;
	private int defaultAddress;
	private String address;
	
	private int pageNum;
	private int selectVal1;
	private int selectVal2;
	private Date startDate;
	private Date endDate;
	private String searchText;
	
	
	public AdminUserManageDTO() {
		// TODO Auto-generated constructor stub
	}


	public AdminUserManageDTO(int userSeq, String email, String pwd, String userName, String nickname,
			String profileName, String phone, int auth, Date userDate, int mileage, int defaultAddress, String address,
			int pageNum, int selectVal1, int selectVal2, Date startDate, Date endDate, String searchText) {
		super();
		this.userSeq = userSeq;
		this.email = email;
		this.pwd = pwd;
		this.userName = userName;
		this.nickname = nickname;
		this.profileName = profileName;
		this.phone = phone;
		this.auth = auth;
		this.userDate = userDate;
		this.mileage = mileage;
		this.defaultAddress = defaultAddress;
		this.address = address;
		this.pageNum = pageNum;
		this.selectVal1 = selectVal1;
		this.selectVal2 = selectVal2;
		this.startDate = startDate;
		this.endDate = endDate;
		this.searchText = searchText;
	}


	public int getUserSeq() {
		return userSeq;
	}


	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getProfileName() {
		return profileName;
	}


	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAuth() {
		return auth;
	}


	public void setAuth(int auth) {
		this.auth = auth;
	}


	public Date getUserDate() {
		return userDate;
	}


	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public int getDefaultAddress() {
		return defaultAddress;
	}


	public void setDefaultAddress(int defaultAddress) {
		this.defaultAddress = defaultAddress;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	public int getSelectVal1() {
		return selectVal1;
	}


	public void setSelectVal1(int selectVal1) {
		this.selectVal1 = selectVal1;
	}


	public int getSelectVal2() {
		return selectVal2;
	}


	public void setSelectVal2(int selectVal2) {
		this.selectVal2 = selectVal2;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getSearchText() {
		return searchText;
	}


	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}


	@Override
	public String toString() {
		return "AdminUserManageDTO [userSeq=" + userSeq + ", email=" + email + ", pwd=" + pwd + ", userName=" + userName
				+ ", nickname=" + nickname + ", profileName=" + profileName + ", phone=" + phone + ", auth=" + auth
				+ ", userDate=" + userDate + ", mileage=" + mileage + ", defaultAddress=" + defaultAddress
				+ ", address=" + address + ", pageNum=" + pageNum + ", selectVal1=" + selectVal1 + ", selectVal2="
				+ selectVal2 + ", startDate=" + startDate + ", endDate=" + endDate + ", searchText=" + searchText + "]";
	}
	
	


}
