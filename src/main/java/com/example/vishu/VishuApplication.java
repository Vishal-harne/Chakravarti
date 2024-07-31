package com.example.vishu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
@SpringBootApplication
public class VishuApplication {
	
	@GetMapping("/msg")
	public String show() {
		return "This is vishal project";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VishuApplication.class, args);
	}

}
