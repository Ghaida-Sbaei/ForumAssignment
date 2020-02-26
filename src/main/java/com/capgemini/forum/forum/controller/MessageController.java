package com.capgemini.forum.forum.controller;

import com.capgemini.forum.forum.models.Messages;
import com.capgemini.forum.forum.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Messages> getMessage(){
        return messageRepository.findAll();
    }
    @PostMapping
    public void addMessage(@RequestBody Messages message){
        messageRepository.save(message);
    }
}
