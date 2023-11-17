package com.ecommerce.deliveryboy.service;

import com.ecommerce.deliveryboy.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;// <String, String> Here the key is the topic name and value can be any type of data

    public boolean updateLocation(String location) {

        kafkaTemplate.send(KafkaConfig.topicName, location);

        return true;
    }

}
