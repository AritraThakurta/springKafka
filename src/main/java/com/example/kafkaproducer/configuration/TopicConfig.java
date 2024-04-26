package com.example.kafkaproducer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    @Bean
    public NewTopic newTopic(){
        return new NewTopic("aritratech-spring-topic",3, (short) 1);
    }
}
