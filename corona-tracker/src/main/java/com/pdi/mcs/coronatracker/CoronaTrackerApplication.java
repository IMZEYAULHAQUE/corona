package com.pdi.mcs.coronatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableHystrix
public class CoronaTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackerApplication.class, args);
	}

}
