package com.kafka.eg.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "string";

    @GetMapping("/publish/{name}")
    public String sendMessage(@PathVariable("name") String name) {

        kafkaTemplate.send(TOPIC, name); // for simple string message. no config required
//        kafkaTemplate.send(TOPIC, new User().setName(name).setSalary("100"));
        return "published success";
    }
}
