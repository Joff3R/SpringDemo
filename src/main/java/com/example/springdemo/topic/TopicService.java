package com.example.springdemo.topic;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
@Getter
public class TopicService {

    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "Spring Framework", "JavaScript Description"))
    );

    public Topic getTopic(String id) {
        return topics
                .stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        IntStream.range(0, topics.size()).forEach(i -> {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
            }
        });
    }

    public void deleteTopic(String id){
        topics.removeIf(e -> e.getId().equals(id));
    }
}
