package com.sclw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SclwNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclwNamingServerApplication.class, args);
	}

}
