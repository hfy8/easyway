package com.easyway.easywaygoods.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public interface orderapi {

    @RequestMapping("/testkkk")
    @ResponseBody
    public String neworder();

}
