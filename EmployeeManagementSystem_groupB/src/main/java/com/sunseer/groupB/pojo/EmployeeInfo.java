package com.sunseer.groupB.pojo;

public class EmployeeInfo {
	private int user_id;
	private String user_firstname;
	private String user_lastname;
	private String user_firstkata;
	private String user_lastkata;
	private String user_gender;
	private String depart_name;
	private String user_birth;
	private String user_tele;
	private String user_mail;
	private String user_address;
	private String user_education;
	private String user_special;
	private byte[] user_image;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_firstname() {
		if(user_firstname == null) {
			user_firstname = "";
		}
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_lastname() {
		if(user_lastname == null) {
			user_lastname = "";
		}
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_firstkata() {
		if(user_firstkata == null) {
			user_firstkata = "";
		}
		return user_firstkata;
	}
	public void setUser_firstkata(String user_firstkata) {
		this.user_firstkata = user_firstkata;
	}
	public String getUser_lastkata() {
		if(user_lastkata == null) {
			user_lastkata = "";
		}
		return user_lastkata;
	}
	public void setUser_lastkata(String user_lastkata) {
		this.user_lastkata = user_lastkata;
	}
	public String getUser_gender() {
		if(user_gender == null) {
			user_gender = "";
		}
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getDepart_name() {
		if(depart_name == null) {
			depart_name = "";
		}
		return depart_name;
	}
	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}
	public String getUser_birth() {
		if(user_birth == null) {
			user_birth = "";
		}
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_tele() {
		if(user_tele == null) {
			user_tele = "";
		}
		return user_tele;
	}
	public void setUser_tele(String user_tele) {
		this.user_tele = user_tele;
	}
	public String getUser_mail() {
		if(user_mail == null) {
			user_mail = "";
		}
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_address() {
		if(user_address == null) {
			user_address = "";
		}
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_education() {
		if(user_education == null) {
			user_education = "";
		}
		return user_education;
	}
	public void setUser_education(String user_education) {
		this.user_education = user_education;
	}
	public String getUser_special() {
		if(user_special == null) {
			user_special = "";
		}
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

	public String makeSearchSql() {
		StringBuffer sql = new StringBuffer();

		sql.append("where");
		if(this.getUser_firstname().equals("") == false)
			sql.append(" user_firstname like '%" + this.getUser_firstname() +"%' and ");
		if(this.getUser_lastname().equals("") == false)
			sql.append(" user_lastname like '%" + this.getUser_lastname() +"%' and ");
		if(this.getUser_firstkata().equals("") == false)
			sql.append(" user_firstkata like '%" + this.getUser_firstkata() +"%' and ");
		if(this.getUser_lastkata().equals("") == false)
			sql.append(" user_lastkata like '%" + this.getUser_lastkata() +"%' and ");
		if(this.getUser_gender().equals("") == false)
			sql.append(" user_gender like '%" + this.getUser_gender() +"%' and ");
		if(this.getDepart_name().equals("") == false)
			sql.append(" depart_name like '%" + this.getDepart_name() +"%' and ");
		if(this.getUser_birth().equals("") == false)
			sql.append(" ser_birth like '%" + this.getUser_birth() +"%' and ");
		if(this.getUser_tele().equals("") == false)
			sql.append(" user_tele like '%" + this.getUser_tele() +"%' and ");
		if(this.getUser_mail().equals("") == false)
			sql.append(" user_mail like '%" + this.getUser_mail() +"%' and ");
		if(this.getUser_address().equals("") == false)
			sql.append(" user_address like '%" + this.getUser_address() +"%' and ");
		if(this.getUser_education().equals("") == false)
			sql.append(" user_education like '%" + this.getUser_education() +"%' and ");
		if(this.getUser_special().equals("") == false)
			sql.append(" user_special like '%" + this.getUser_special() +"%' and ");

		sql.delete(sql.length()-5, sql.length());
		return sql.toString();
	}
}
