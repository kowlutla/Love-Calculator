package com.ks.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/test")
	public String test() {
		return "hello-world";
	}
}
