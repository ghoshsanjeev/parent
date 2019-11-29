package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(Constants.MODULE_NAME);
		SpringApplication.run(DemoApplication.class, args);
	}

}
