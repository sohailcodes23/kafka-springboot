package com.ecommerce.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    public static final String topicName = "location-topic";

    // use to consume the message published from the producer
    // will throw error if groupId is not passed
    @KafkaListener(topics = topicName, groupId = "group-1")
    public void consumeLocation(String value) {

        System.out.println("NEW LOCATION: " + value);
    }

}
