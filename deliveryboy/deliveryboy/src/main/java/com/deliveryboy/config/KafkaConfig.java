package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
// import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        // created a topic with no of partitions and replicas
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME).partitions(2).replicas(1).build();

    }

}
