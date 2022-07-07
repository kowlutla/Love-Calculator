package com.ks.lc.api;



public class UserInfoDTO {
	
	private String userName="UserName";
	private String crushName="CrushName";
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
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	

}
