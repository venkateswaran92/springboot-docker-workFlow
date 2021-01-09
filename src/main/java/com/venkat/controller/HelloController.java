package com.venkat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/getGreating")
	public String greatings() {
		
		return "GitHub action demo venkat....";
	}
}
