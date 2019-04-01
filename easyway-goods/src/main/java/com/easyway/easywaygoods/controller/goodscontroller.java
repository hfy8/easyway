package com.easyway.easywaygoods.controller;

import com.easyway.easywaygoods.service.orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class goodscontroller {
    @Autowired
    orderservice orderservice;

    @RequestMapping("/test")
    public String neworde(){
        orderservice.neworder();
        return "OK65465";
    }
}

