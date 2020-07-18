package com.buck.consumer.controller;

import com.buck.consumer.entity.User;
import com.buck.consumer.result.CommonResult;
import com.buck.consumer.servive.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

    private UserService userService;
    private RestTemplate restTemplate;

    public MainController(UserService userService, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CommonResult<List<User>> index() {
        return new CommonResult<>(200, "up", userService.getAllUser());
    }

    @GetMapping("{id}")
    public String lb(@PathVariable("id")Integer id) {

        return restTemplate.getForObject("http://producer/produce/" + id, String.class);
    }
}
