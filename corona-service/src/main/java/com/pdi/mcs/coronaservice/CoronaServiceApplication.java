package com.pdi.mcs.coronaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoronaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaServiceApplication.class, args);
	}
}
