package com.example.demogit;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/index")
    public String test(){
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        System.out.println(2);
        return "hello controller";
    }

}
