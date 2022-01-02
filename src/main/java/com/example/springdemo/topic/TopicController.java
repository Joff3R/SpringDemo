package com.example.springdemo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return null;
    }
}
