package com.example.springdemo.topic;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Getter
public class TopicService {

    private final List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "Spring Framework", "JavaScript Description")
    );

    public Topic getTopic(String id){
        return topics
                .stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);

    }
}
