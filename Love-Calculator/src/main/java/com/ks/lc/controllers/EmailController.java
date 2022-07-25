package com.ks.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ks.lc.api.EmailDto;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
	
		model.addAttribute("emailDto",new EmailDto());
		return "send-email-page";
	}

	@RequestMapping("/processEmail")
	public String processEmail(@ModelAttribute("emailDto") EmailDto emailDto) {
		return "process-email-page";
	}
}
