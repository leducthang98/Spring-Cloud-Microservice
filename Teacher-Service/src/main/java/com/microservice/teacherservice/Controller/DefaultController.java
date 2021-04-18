package com.microservice.teacherservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class DefaultController {

    @GetMapping("/")
    public String demo() {
        return "This is teacher service";
    }

    @GetMapping("/ping")
    public String ping(){
        return "PONG";
    }

}
