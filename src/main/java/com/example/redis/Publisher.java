package com.example.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class Publisher {
    private final StringRedisTemplate template;
    private final ChannelTopic channelTopic;

    @Autowired
    public Publisher(StringRedisTemplate template, ChannelTopic channelTopic) {
        this.template = template;
        this.channelTopic = channelTopic;
    }

    public void publish(String message) {
        log.info("publishing message {} " , message);
        template.convertAndSend(channelTopic.getTopic(), message);
    }
}
