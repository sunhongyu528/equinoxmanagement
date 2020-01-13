package com.changhongit.equinoxmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EquinoxmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquinoxmanagementApplication.class, args);
	}

	@RequestMapping("/")
	String index() {
		return "EquinoxmanagementApplication spring boot";
	}
}
