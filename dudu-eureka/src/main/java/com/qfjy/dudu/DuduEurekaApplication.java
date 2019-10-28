package com.qfjy.dudu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DuduEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuduEurekaApplication.class, args);
	}

}
