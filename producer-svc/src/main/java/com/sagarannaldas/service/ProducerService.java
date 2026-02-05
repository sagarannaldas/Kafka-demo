package com.sagarannaldas.service;

import com.sagarannaldas.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Notification> kafkaTemplate;

    public String sendNotification(Notification notification) {
        kafkaTemplate.send("notification", "email", notification);
        return "Notification sent to Kafka server";
    }
}
