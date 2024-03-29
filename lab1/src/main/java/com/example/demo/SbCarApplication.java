package com.example.demo;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SbCarApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SbCarApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SbCarApplication.class, args);
        LOG.info("Car App started ! Go http://localhost:8081/dic_student_name");
    }
}


@RestController
@RequestMapping("/dic_student_name")
public class SbCarController {

    @Value("${fullname:Bamba}")
    private String fullname;

    @GetMapping
    public String getFullName() {
        return "Welcome to the Car App, " + fullname + " !";
    }
}