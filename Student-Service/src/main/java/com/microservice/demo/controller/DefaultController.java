package com.microservice.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class DefaultController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String demo() {
        return "This is student service";
    }

    @GetMapping("/ping-teacher")
    public String pingTeacher() {
        String response = restTemplate.getForObject("http://TEACHER-SERVICE/teacher/ping",String.class);
        return response;
    }

}
