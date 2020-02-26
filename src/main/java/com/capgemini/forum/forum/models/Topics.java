package com.capgemini.forum.forum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Topics {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Account account;

    public Topics(Long id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }
    public Topics(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
