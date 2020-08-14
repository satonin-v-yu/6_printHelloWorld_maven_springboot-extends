package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Текст на русском в консоли");
		return "Greetings from Spring Boot! from P.S. 5_printHelloWorld_maven_springboot";
	}

}
