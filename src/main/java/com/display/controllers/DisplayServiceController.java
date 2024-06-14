package com.display.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayServiceController {

	@GetMapping("/get")
	public String getResonse() {
		return "DisplayService Caller";
	}
	
}
