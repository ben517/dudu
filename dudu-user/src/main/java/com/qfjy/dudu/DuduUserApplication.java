package com.qfjy.dudu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages ={"com.qfjy.dudu.mapper"})
@EnableDiscoveryClient
public class DuduUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuduUserApplication.class, args);
	}

}
