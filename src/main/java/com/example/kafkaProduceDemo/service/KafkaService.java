package com.example.kafkaProduceDemo.service;

import com.example.kafkaProduceDemo.constants.KafkaConstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean sendKafkaProduceMessage(){
        this.kafkaTemplate.send(KafkaConstance.KAFKA_TOPIC_NAME, String.valueOf (Math.random() * 10));
        logger.info("Kafka stream produced");
        return true;
    }
}
