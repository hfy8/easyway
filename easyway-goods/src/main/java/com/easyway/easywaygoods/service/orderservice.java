package com.easyway.easywaygoods.service;

import com.easyway.easywaygoods.api.orderapi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "easyway-order-service")
@Component
public interface orderservice extends orderapi {
}
