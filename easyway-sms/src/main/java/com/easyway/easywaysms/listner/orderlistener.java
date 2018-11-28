package com.easyway.easywaysms.listner;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Map;

@Component
public class orderlistener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "order.change.queue", durable = "true"),
            exchange = @Exchange(value = "EASYWAY_ORDER_EXCHANGE",
                    ignoreDeclarationExceptions = "true"),
            key = {"order.change.code"}))
    public void listenSms(String msg) throws Exception {
            System.out.println(msg);
    }

}
