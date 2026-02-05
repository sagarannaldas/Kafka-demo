package com.sagarannaldas.controller;

import com.sagarannaldas.model.Notification;
import com.sagarannaldas.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka/producer")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
        String response = producerService.sendNotification(notification);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
