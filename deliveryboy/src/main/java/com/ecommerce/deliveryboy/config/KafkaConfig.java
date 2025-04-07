package com.ecommerce.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String topicName = "location-topic";

    public static final String employeeTopicName = "employee-topic";

    // to create new topics, the topic name for now is static
    @Bean
    public NewTopic createNewTopic() {

        return TopicBuilder
                .name(topicName)
                // there are other configurations as well like .replicas, .partitions
                .build();
    }

    @Bean
    public NewTopic createEmpNewTopic() {

        return TopicBuilder
                .name(employeeTopicName)
                // there are other configurations as well like .replicas, .partitions
                .build();
    }
}
