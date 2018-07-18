package com.example.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/message/")
public class RestResource {
	
	@Value("${message}")
	private String msg;

	@GetMapping
	public String sayHello(){
		return msg;
	}
}
