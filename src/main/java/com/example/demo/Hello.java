package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "汪纤纤  又在看电视";
        return "汪纤纤  又在看电视";
    }
}
