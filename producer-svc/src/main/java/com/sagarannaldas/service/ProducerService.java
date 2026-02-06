package com.sagarannaldas.service;

import com.sagarannaldas.model.Notification;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public String sendNotification(Notification notification) {
        JSONObject jsonObject = this.objectMapper.convertValue(notification, JSONObject.class);
        kafkaTemplate.send("notification", "email", jsonObject.toString());
        return "Notification sent to Kafka server";
    }
}
