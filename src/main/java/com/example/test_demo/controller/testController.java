package com.example.test_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yxy
 * @date 2021-04-21 11:37
 */
@RestController
@RequestMapping("test")
public class testController {

    @GetMapping("home")
    public void home(){
        System.out.println("hellow word!!!!");
    }
}
