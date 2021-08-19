package com.example.demogit;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/index")
    public String test(){
        return "hello controller";
    }
    String JJJJJJJJJJJJJJJJJJJJJJJJJ;

}
