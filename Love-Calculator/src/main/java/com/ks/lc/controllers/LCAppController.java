package com.ks.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ks.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO ) {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "result-page";
	}
	

}
