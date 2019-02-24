package com.kiran.netflix.eureka.server.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/eureka/server")
public class HelloService {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Eureka!";
	}
}
