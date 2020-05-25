package com.sunseer.groupB.pojo;

import java.sql.Date;

public class EmployeeInfo {
	private int id;
	private String name;
	private String gender;
	private String division;
	private Date birthday;
	private String mailaddress;
	private String phoneNumber;
	private String lastEducational;
	private String specialSkill;
	private byte[] facePhoto;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
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
