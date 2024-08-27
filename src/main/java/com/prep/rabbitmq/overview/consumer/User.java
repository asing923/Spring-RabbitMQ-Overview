package com.prep.rabbitmq.overview.consumer;

import com.prep.rabbitmq.overview.config.MessagingConfig;
import com.prep.rabbitmq.overview.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from queue : " + orderStatus);
    }
}
