package com.easyway.easywayorder.controller;

//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class orderchangecontroller {

    @Autowired
    AmqpTemplate rabbitmqTemplate;


    @RequestMapping("/testkkk")
    @ResponseBody
    public String neworder(){
        rabbitmqTemplate.convertAndSend("EASYWAY_ORDER_EXCHANGE", "order.change.code", "8085");
        System.out.println("wobei");
        return "qeug3iurg3rui";
    }
}
