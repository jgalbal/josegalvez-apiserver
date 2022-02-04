package com.josegalvez.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JosegalvezApiserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosegalvezApiserverApplication.class, args);
	}

}
