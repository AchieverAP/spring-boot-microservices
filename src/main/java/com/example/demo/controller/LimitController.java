package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.LimitConfiguration;
import com.example.demo.model.LimitValue;

@RestController
public class LimitController {

	@Autowired
	private LimitConfiguration Configuration;
	
	@GetMapping("/limits")
	public LimitValue getLimitValue() {
		
		return new LimitValue(Configuration.getMin(),Configuration.getMax());
	}
	
}
