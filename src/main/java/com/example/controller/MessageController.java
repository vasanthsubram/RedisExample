package com.example.controller;

import com.example.redis.Publisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {
    private final Publisher publisher;

    public MessageController(Publisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping("/publish")
    public void publishMessage(@RequestParam("message") String message) {
        log.info("Received message in controller {} ", message);
        publisher.publish(message);
    }
}
