package com.sagarannaldas.controller;

import com.sagarannaldas.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/get-notification")
    public ResponseEntity<String> getNotification() {
        String response = consumerService.getMessage();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
