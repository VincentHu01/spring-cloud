package com.ai.es.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix="druid") //加载时读取指定的配置信息,前缀为spring.datasource.druid
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
