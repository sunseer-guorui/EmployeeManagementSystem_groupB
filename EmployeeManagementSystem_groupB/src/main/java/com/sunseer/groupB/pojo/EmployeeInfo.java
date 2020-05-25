package com.sunseer.groupB.pojo;

import java.sql.Date;

public class EmployeeInfo {
	private int id;
	private String firstname;
	private String lastname;
	private String firstkata;
	private String lastkata;
	private String gender;
	private String depart;
	private Date birthday;
	private String mailaddress;
	private String phoneNumber;
	private String address;
	private String lastEducational;
	private String specialSkill;
	private byte[] facePhoto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstkata() {
		return firstkata;
	}
	public void setFirstkata(String firstkata) {
		this.firstkata = firstkata;
	}
	public String getLastkata() {
		return lastkata;
	}
	public void setLastkata(String lastkata) {
		this.lastkata = lastkata;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMailaddress() {
		return mailaddress;
	}
	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastEducational() {
		return lastEducational;
	}
	public void setLastEducational(String lastEducational) {
		this.lastEducational = lastEducational;
	}
	public String getSpecialSkill() {
		return specialSkill;
	}
	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}
	public byte[] getFacePhoto() {
		return facePhoto;
	}
	public void setFacePhoto(byte[] facePhoto) {
		this.facePhoto = facePhoto;
	}

}
