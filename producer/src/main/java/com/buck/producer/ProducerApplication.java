package com.buck.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProducerApplication.class, args);
	}

}
