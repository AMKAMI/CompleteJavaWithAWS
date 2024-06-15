package com.display.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayServiceController {

	@GetMapping("/get")
	public String getResonse() {
		return "DisplayService Caller";
	}
	
	@GetMapping("/show")
	public String getShowResonse() {
		return "Amit has created a new controller";
	}
	
}
