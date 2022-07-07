package com.ks.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ks.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
	
		return "user-registration-page";
	}
	
	@RequestMapping("/processRegistration")
	public String processRegistration(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		return "confirm-registration";
	}

}
