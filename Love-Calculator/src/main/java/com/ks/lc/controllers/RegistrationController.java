package com.ks.lc.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ks.lc.api.CommunicationDTO;
import com.ks.lc.api.Phone;
import com.ks.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		
		Phone phone=new Phone();
		phone.setCountryCode("91");
		phone.setNumber("9052118851");
		CommunicationDTO communicationDTO=new CommunicationDTO();
		communicationDTO.setEmail("kowlutla1119@gmail.com");
		communicationDTO.setPhone(phone);
		
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		return "user-registration-page";
	}
	
	@RequestMapping("/processRegistration")
	public String processRegistration(@Valid @ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO,BindingResult result) {
		
		if(result.hasErrors()) {
			return "user-registration-page";
		}
		return "confirm-registration";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside the init binder method....");
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,"name", editor);
		
		//NamePropertyEditor nameEditor=new NamePropertyEditor();
		//binder.registerCustomEditor(String.class, "name",nameEditor);
	}

}
