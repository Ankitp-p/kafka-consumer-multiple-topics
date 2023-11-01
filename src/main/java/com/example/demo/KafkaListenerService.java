package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaListenerService {


    @KafkaListener(topics = "${primarykafka.topic}" ,groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
    @KafkaListener(topics = "${secondarykafka.topic}" ,groupId = "group_id")
    public void consumesecond(String message) {
        System.out.println("Consumed message: " + message);
    }
}
