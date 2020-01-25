package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Depends on : "+Constants.MODULE_NAME);
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping(){
		return "Service is up";
	}

}
