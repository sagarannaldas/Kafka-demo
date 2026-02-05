package com.sagarannaldas.service;

import com.sagarannaldas.model.Notification;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private String message;

    @KafkaListener(topics = "notification", groupId = "email-notification-group")
    public void  consume(Notification notification) {
        message = notification + "Got the notification from kafka";
        System.out.println("Received message: " + message);
    }

    public String getMessage() {
        return message;
    }
}
