package com.decolab.wanza.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	
	private int userSeq;
	private String email;
	private String pwd;
	private String nickname;
	private String profileName;
	private String phone;
	private int auth;
	private int mileage;
	private int defaultAddress;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int userSeq, String email, String pwd, String nickname, String profileName, String phone, int auth,
			int mileage, int defaultAddress) {
		super();
		this.userSeq = userSeq;
		this.email = email;
		this.pwd = pwd;
		this.nickname = nickname;
		this.profileName = profileName;
		this.phone = phone;
		this.auth = auth;
		this.mileage = mileage;
		this.defaultAddress = defaultAddress;
	}

	public UserDTO(String email, String pwd, String nickname, String phone) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.nickname = nickname;
		this.phone = phone;
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

	@Override
	public String toString() {
		return "UserDTO [userSeq=" + userSeq + ", email=" + email + ", pwd=" + pwd + ", nickname=" + nickname
				+ ", profileName=" + profileName + ", phone=" + phone + ", auth=" + auth + ", mileage=" + mileage
				+ ", defaultAddress=" + defaultAddress + "]";
	}
	
	

}