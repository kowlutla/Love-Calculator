package com.ks.lc.api;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.ks.lc.validator.Age;

public class UserRegistrationDTO {
	
	@NotEmpty(message = "* can not be empty")
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;
	
	@Age(lower = 20, upper = 50)
	private Integer age;
	private CommunicationDTO communicationDTO;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	@Override
	public String toString() {
		return "UserRegistrationDTO [name=" + name + ", userName=" + userName + ", password="
				+ Arrays.toString(password) + ", country=" + country + ", hobbies=" + Arrays.toString(hobbies)
				+ ", gender=" + gender + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
