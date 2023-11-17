package com.ecommerce.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public static final String topicName = "location-topic";

    // to create new topics, the topic name for now is static
    @Bean
    public NewTopic createNewTopic() {

        return TopicBuilder
                .name(topicName)
                // there are other configurations as well like .replicas, .partitions
                .build();
    }
}
