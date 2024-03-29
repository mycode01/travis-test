package com.example.travisCITest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TravisCiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisCiTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

}
