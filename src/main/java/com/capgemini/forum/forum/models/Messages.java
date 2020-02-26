package com.capgemini.forum.forum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Messages {
    @Id
    @GeneratedValue
    private Long id;
    private String message;
    @ManyToOne
    private Account account;
    @ManyToOne
    private Topics topic;

    public Messages(Long id, String message, Account account, Topics topic) {
        this.id = id;
        this.message = message;
        this.account = account;
        this.topic = topic;
    }
    public Messages(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Topics getTopic() {
        return topic;
    }

    public void setTopic(Topics topic) {
        this.topic = topic;
    }
}
