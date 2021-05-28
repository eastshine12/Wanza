package com.decolab.wanza.dto;

import java.io.Serializable;

public class PaymentDTO implements Serializable {
	
	
	private String dlvy_address1;
	private String dlvy_address2;
	private String email1;
	private String email2;
	private String name;
	private int phone1;
	private int phone2;
	private String rname;
	private String rphone;
	private int userSeq;

	

	public PaymentDTO() {
		// TODO Auto-generated constructor stub
	}



	public PaymentDTO(String dlvy_address1, String dlvy_address2, String email1, String email2, String name, int phone1,
			int phone2, String rname, String rphone, int userSeq) {
		super();
		this.dlvy_address1 = dlvy_address1;
		this.dlvy_address2 = dlvy_address2;
		this.email1 = email1;
		this.email2 = email2;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.rname = rname;
		this.rphone = rphone;
		this.userSeq = userSeq;
	}



	public String getDlvy_address1() {
		return dlvy_address1;
	}



	public void setDlvy_address1(String dlvy_address1) {
		this.dlvy_address1 = dlvy_address1;
	}



	public String getDlvy_address2() {
		return dlvy_address2;
	}



	public void setDlvy_address2(String dlvy_address2) {
		this.dlvy_address2 = dlvy_address2;
	}



	public String getEmail1() {
		return email1;
	}



	public void setEmail1(String email1) {
		this.email1 = email1;
	}



	public String getEmail2() {
		return email2;
	}



	public void setEmail2(String email2) {
		this.email2 = email2;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhone1() {
		return phone1;
	}



	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}



	public int getPhone2() {
		return phone2;
	}



	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}



	public String getRname() {
		return rname;
	}



	public void setRname(String rname) {
		this.rname = rname;
	}



	public String getRphone() {
		return rphone;
	}



	public void setRphone(String rphone) {
		this.rphone = rphone;
	}



	public int getUserSeq() {
		return userSeq;
	}



	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}



	@Override
	public String toString() {
		return "PaymentDTO [dlvy_address1=" + dlvy_address1 + ", dlvy_address2=" + dlvy_address2 + ", email1=" + email1
				+ ", email2=" + email2 + ", name=" + name + ", phone1=" + phone1 + ", phone2=" + phone2 + ", rname="
				+ rname + ", rphone=" + rphone + ", userSeq=" + userSeq + "]";
	}




		

}
