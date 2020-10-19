package cn.ccbetter.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("hello")
@EnableAutoConfiguration
public class HelloController {
    @GetMapping("show")
    public String test(){
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
