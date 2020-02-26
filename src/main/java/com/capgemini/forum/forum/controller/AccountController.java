package com.capgemini.forum.forum.controller;

import com.capgemini.forum.forum.models.Account;
import com.capgemini.forum.forum.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping
    public List<Account> getAccount(){

        return accountRepository.findAll();
    }

    @PostMapping
    public void addAccount(@RequestBody Account account){
        accountRepository.save(account);

    }


}
