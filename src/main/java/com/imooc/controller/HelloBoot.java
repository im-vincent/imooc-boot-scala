package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: searainbow
 */
@RestController
public class HelloBoot {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Boot....";
    }
}
