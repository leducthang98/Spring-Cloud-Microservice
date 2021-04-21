package com.microservice.cloudgateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/student-service-fallback")
    public String studentServiceFallBackMethod(){
        return "Student Service is taking longer than expected, please try again later.";
    }

    @GetMapping("/teacher-service-fallback")
    public String teacherServiceFallBackMethod(){
        return "Teacher Service is taking longer than expected, please try again later.";
    }
}
