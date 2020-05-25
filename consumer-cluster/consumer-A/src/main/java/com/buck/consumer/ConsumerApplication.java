package com.buck.consumer;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.sql.SQLException;


@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(ConsumerApplication.class, args);
    }

}
