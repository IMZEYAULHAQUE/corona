package com.pdi.mcs.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(McsDiscoveryApplication.class, args);
	}

}
