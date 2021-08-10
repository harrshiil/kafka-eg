package com.kafka.eg.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "string", groupId = "group_id")
    public void consume(String user) {
        System.out.println(user);
    }
}
