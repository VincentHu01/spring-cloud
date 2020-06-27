package com.ai.ms.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsService02Application {

	public static void main(String[] args) {
		SpringApplication.run(MsService02Application.class, args);
	}

}

