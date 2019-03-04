package com.ai.ms.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ai.ms.service.consumer")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class MsServiceConsumerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        SpringApplication.run(MsServiceConsumerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MsServiceConsumerApplication.class);
	}

}

