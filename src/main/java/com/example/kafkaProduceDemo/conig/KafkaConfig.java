package com.example.kafkaProduceDemo.conig;

import com.example.kafkaProduceDemo.constants.KafkaConstance;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic newTopicCreation(){

        return TopicBuilder
                .name(KafkaConstance.KAFKA_TOPIC_NAME)
                .build();
    }
}
