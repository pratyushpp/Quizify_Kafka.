package com.stackroute.springbootkafkaconsumer.service;

import com.stackroute.springbootkafkaconsumer.domain.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaService {

    @KafkaListener(topics ="Kafka_Example",groupId="group_id")
    public void consume(String message)
    {
        System.out.println("Consumed Message:" + message);
    }
    @KafkaListener(topics="Kafka_json", groupId = "group_json",containerFactory ="userKafkaListenerFactory")
 public void consumeJson(User user)

    {
        System.out.println("Console:"+user);
    }
}
