package com.buck.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.util.PathMatcher;

@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class AdminApplication {
	PathMatcher
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
