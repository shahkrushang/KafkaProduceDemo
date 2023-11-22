package com.example.kafkaProduceDemo.controller;

import com.example.kafkaProduceDemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/kafkaProduce")
    public ResponseEntity<?> produceMessage(){
        kafkaService.sendKafkaProduceMessage();
        return new ResponseEntity<>(ResponseEntity.ok("kafka producer done."), HttpStatus.OK);
    }
}
