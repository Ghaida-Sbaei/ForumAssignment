package com.capgemini.forum.forum.controller;

import com.capgemini.forum.forum.models.Topics;
import com.capgemini.forum.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topic")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public List<Topics> getTopic(){
        return topicRepository.findAll();
    }
    @PostMapping
    public void addTopic(@RequestBody Topics topic){
        topicRepository.save(topic);
    }

}
