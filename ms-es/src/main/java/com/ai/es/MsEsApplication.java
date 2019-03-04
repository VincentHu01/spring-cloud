package com.ai.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.ai.es.dao")

public class MsEsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEsApplication.class, args);
	}

}
