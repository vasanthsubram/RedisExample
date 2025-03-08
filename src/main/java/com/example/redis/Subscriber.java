package com.example.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class Subscriber {
    public void receiveMessage(String message) {
        log.info("Received: {}", message);
    }
}
