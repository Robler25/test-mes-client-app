package com.rafi.testsessionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestSessionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSessionServiceApplication.class, args);
	}

}
