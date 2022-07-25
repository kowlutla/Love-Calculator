package com.ks.lc.api;

public class EmailDto {

	private String userEmail;

	public EmailDto() {
	}

	public EmailDto(String userEmail) {
		super();
		this.userEmail = userEmail;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
