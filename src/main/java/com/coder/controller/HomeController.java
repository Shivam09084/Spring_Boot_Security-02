package com.coder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return"about";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return"profile";
	}
	
	@GetMapping("/signin")
	public String signin() {
		return"login";
	}
	
	@GetMapping("/userlogout")
	public String logout() {
		return "logout";
	}
}
