package com.ks.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "* Your name should not blank")
	@Size(min = 3, max = 20,message ="*Your name should have 3-20 chars")
	private String userName;
	
	@NotBlank(message = "* Crush name should not blank")
	@Size(min = 3, max = 20,message ="*Crush name should have 3-20 chars")
	private String crushName;
	@AssertTrue(message = "* You have to agree terms and conditions")
	private boolean termAndConditions;
	public String getUserName() {
		//System.out.println("getUserName()");
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		//System.out.println("setUserName(String userName)");
	}
	public String getCrushName() {
		//System.out.println("getCrushName()");
		return crushName;
		
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
		//System.out.println("setCrushName(String crushName)");
	}
	
	
	public boolean isTermAndConditions() {
		return termAndConditions;
	}
	public void setTermAndConditions(boolean termAndConditions) {
		this.termAndConditions = termAndConditions;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	

}
