package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// used to specify that this is a controller
@RestController 
public class HomeController {

	@RequestMapping("/")
	public String home(){
		
		return "Das Boot, reporting for duty!";
	}
	
}
