package com.ecommerce.deliveryboy.service;

import com.ecommerce.deliveryboy.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    public KafkaTemplate<Object, common.dto.Employee> kafkaTemplate;// <String, Employee> Here the key is the topic name and value can be any type of data

    @Autowired
    public KafkaTemplate<String, String> strKafkaTemplate;// <String, String> Here the key is the topic name and value can be any type of data


    public boolean updateLocation(String location) {

        strKafkaTemplate.send(KafkaConfig.topicName, location);

        return true;
    }

    public boolean sendEmployee(int age) {

        common.dto.Employee employee = new common.dto.Employee("Employee " + age, age);
        kafkaTemplate.send(KafkaConfig.employeeTopicName, employee);

        return true;
    }

}
