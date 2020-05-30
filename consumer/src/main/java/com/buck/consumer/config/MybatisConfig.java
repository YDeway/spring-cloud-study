package com.buck.consumer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.buck.consumer.mapper")
public class MybatisConfig {

}
