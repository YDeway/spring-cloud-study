package com.buck.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.io.ResourceLoader;

import java.beans.PropertyEditor;


@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {
    PropertyEditor
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
