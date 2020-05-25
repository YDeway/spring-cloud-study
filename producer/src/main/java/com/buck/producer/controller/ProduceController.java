package com.buck.producer.controller;

import com.buck.producer.bean.Properties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Controller
@RestController
@RequestMapping("/produce")
public class ProduceController {

    @Autowired
    Properties props;


    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    public String produce(@PathVariable("id")Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id.toString() +  "  "  + Thread.currentThread().getName() + "---" + props.toString();
    }

    public String fallback(Integer id) {

        return "请稍后再试";
    }
}
