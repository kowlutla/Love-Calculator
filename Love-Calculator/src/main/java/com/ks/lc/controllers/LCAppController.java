package com.ks.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ks.lc.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage(Model model) {
		model.addAttribute("userInfo", new UserInfoDTO());
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result) {
		
		System.out.println(userInfoDTO.isTermAndConditions());
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "home-page";
		}
		//write a service which will calculate the love % btwn you and crush
		
		
		return "result-page";
	}
	

}
