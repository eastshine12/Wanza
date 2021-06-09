package com.decolab.wanza.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDTO implements Serializable {
	
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
	private String agerange;
	private String gender;
	private String birth;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	//카카오로 얻어오는 정보
	public UserDTO(String email, String nickname, String agerange, String gender, String birth) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.agerange = agerange;
		this.gender = gender;
		this.birth = birth;
	}




	public String getAgerange() {
		return agerange;
	}




	public void setAgerange(String agerange) {
		this.agerange = agerange;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getBirth() {
		return birth;
	}




	public void setBirth(String birth) {
		this.birth = birth;
	}




	public UserDTO(int userSeq, String email, String pwd, String userName, String nickname, String profileName,
			String phone, int auth, Date userDate, int mileage, int defaultAddress, String agerange, String gender,
			String birth) {
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
		this.agerange = agerange;
		this.gender = gender;
		this.birth = birth;
	}




	public UserDTO(int userSeq, String email, String pwd, String userName, String nickname, String profileName,
			String phone, int auth, Date userDate, int mileage, int defaultAddress) {
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




	@Override
	public String toString() {
		return "UserDTO [userSeq=" + userSeq + ", email=" + email + ", pwd=" + pwd + ", userName=" + userName
				+ ", nickname=" + nickname + ", profileName=" + profileName + ", phone=" + phone + ", auth=" + auth
				+ ", userDate=" + userDate + ", mileage=" + mileage + ", defaultAddress=" + defaultAddress
				+ ", agerange=" + agerange + ", gender=" + gender + ", birth=" + birth + "]";
	}

	
	
	
	

}
