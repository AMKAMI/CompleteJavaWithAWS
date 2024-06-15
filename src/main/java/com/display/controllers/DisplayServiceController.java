package com.display.controllers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayServiceController {
	
	private static final Logger logger = LogManager.getLogger(DisplayServiceController.class);
	
	@GetMapping("/get")
	public String getResonse() {
		logger.info("Inside get API of DisplayServiceController");
		return "DisplayService Caller";
	}
	
	@GetMapping("/show")
	public String getShowResonse() {
		return "Amit has created a new controller";
	}
	
}
