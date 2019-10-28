package com.qfjy.dudu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = {"com.qfjy.dudu.mapper"})
@EnableDiscoveryClient
public class DuduMeetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuduMeetingApplication.class, args);
	}

}
