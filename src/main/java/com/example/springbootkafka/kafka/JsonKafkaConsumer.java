package com.example.springbootkafka.kafka;

import com.example.springbootkafka.payload.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(Users user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
