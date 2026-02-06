package com.sagarannaldas.service;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private String message;

    @KafkaListener(topics = "notification", groupId = "email-notification-group")
    public void consume(String notification) {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(notification);
        String message = jsonObject.get("message").toString() +  "Got the notification from kafka";
        System.out.println("Received message: " + message);
    }

    public String getMessage() {
        return message;
    }
}
