package com.product.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("被回调的值name：" + name);
        return "hello " + name + "，this is first messge";
    }


}

