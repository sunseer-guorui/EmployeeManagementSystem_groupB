package com.sunseer.groupB.pojo;

public class Loginpass {
	private int id;
	private String author_mail;
	private String author_password;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor_mail() {
		return author_mail;
	}
	public void setAuthor_mail(String author_mail) {
		this.author_mail = author_mail;
	}
	public String getAuthor_password() {
		return author_password;
	}
	public void setAuthor_password(String author_password) {
		this.author_password = author_password;
	}
	public boolean equals(Loginpass lp) {
		System.out.println(lp.getAuthor_mail());
		System.out.println(lp.getAuthor_password());
		return this.getAuthor_mail() == lp.getAuthor_mail()
				&& this.getAuthor_password() == lp.getAuthor_password();
	}
}
