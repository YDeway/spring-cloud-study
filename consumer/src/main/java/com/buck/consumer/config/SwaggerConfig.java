package com.buck.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment env) {
//        String[] activeProfiles = env.getActiveProfiles();
//        Profiles of = Profiles.of(activeProfiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .enable()
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.buck.consumer.controller"))
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
            "Api Documentation",
            "Api Documentation",
            "1.0",
            "urn:tos",
            new Contact("buck", "www.touchim.cn", "790721085@qq.com"),
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            new ArrayList<>());
    }

}
