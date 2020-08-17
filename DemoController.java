package com.W3dev.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@Autowired
	DemoRepository demoRepository;
	
	@GetMapping("/")
	public String getWelcomePage() {
		return "Welcome to W3dev Home page.";
	}
	
	@GetMapping("/record")
	public List<Sample> getHello() {
		return demoRepository.findAll();
	}

}
