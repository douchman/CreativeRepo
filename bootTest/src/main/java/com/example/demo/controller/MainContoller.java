package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContoller {

	@RequestMapping("/")
	public String one() {
		
		return "one";
	}
	
	@RequestMapping("two")
	public String two() {
		
		return "two";
	}
	
}
