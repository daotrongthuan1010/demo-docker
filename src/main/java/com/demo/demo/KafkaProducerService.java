package com.demo.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {


    private final KafkaTemplate<KafkaConfigString, String> kafkaTemplate;

    public void sendMessage(String message, String s) {
        kafkaTemplate.send("my-topic", message);
    }
}