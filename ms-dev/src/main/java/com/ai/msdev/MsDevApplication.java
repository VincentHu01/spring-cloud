package com.ai.msdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan("com.ai.msdev.dao")
@ComponentScan("com.ai.msdev.controller")
//@MapperScan(basePackages = "com.ai.msdev.mapper")
@ServletComponentScan
public class MsDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDevApplication.class, args);
	}

}
