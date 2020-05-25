package com.buck.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/produce")
public class ProduceController {

    @GetMapping("/{id}")
    public String produce(@PathVariable("id")Integer id) {
        return id.toString() +  "  "  + Thread.currentThread().getName();
    }
}
