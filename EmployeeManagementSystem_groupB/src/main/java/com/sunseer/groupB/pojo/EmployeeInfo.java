package com.sunseer.groupB.pojo;

import java.sql.Date;

public class EmployeeInfo {
	private int user_id;
	private String user_firstname;
	private String user_lastname;
	private String user_firstkata;
	private String user_lastkata;
	private String user_gender;
	private String depart_name;
	private Date user_birth;
	private String user_tele;
	private String user_mail;
	private String user_address;
	private String user_Educational;
	private String user_special;
	private byte[] user_image;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_firstname() {
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_firstkata() {
		return user_firstkata;
	}
	public void setUser_firstkata(String user_firstkata) {
		this.user_firstkata = user_firstkata;
	}
	public String getUser_lastkata() {
		return user_lastkata;
	}
	public void setUser_lastkata(String user_lastkata) {
		this.user_lastkata = user_lastkata;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getDepart_name() {
		return depart_name;
	}
	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}
	public Date getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_tele() {
		return user_tele;
	}
	public void setUser_tele(String user_tele) {
		this.user_tele = user_tele;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_Educational() {
		return user_Educational;
	}
	public void setUser_Educational(String user_Educational) {
		this.user_Educational = user_Educational;
	}
	public String getUser_special() {
		return user_special;
	}
	public void setUser_special(String user_special) {
		this.user_special = user_special;
	}
	public byte[] getUser_image() {
		return user_image;
	}
	public void setUser_image(byte[] user_image) {
		this.user_image = user_image;
	}

//	public String MakeSql() {
//		StringBuffer sql = new StringBuffer();
//		if(this.getUser_firstname() != null) {
//			sql.append("user_firstname=" + this.getUser_firstname() + " and ");
//		}
//		if(this.getUser_lastname() != null) {
//			sql.append("user_lastname=" + this.getUser_lastname() + " and ");
//		}
//		if(this.getUser_firstkata() != null) {
//			sql.append("user_firstkata=" + this.getUser_firstkata() + " and ");
//		}
//		if(this.getUser_lastkata() != null) {
//			sql.append("user_lastkata=" + this.getUser_lastkata() + " and ");
//		}
//		if(this.getUser_gender() != null) {
//			sql.append("user_gender=" + this.getUser_gender() + " and ");
//		}
//
//	}
}
