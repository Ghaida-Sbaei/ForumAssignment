package com.capgemini.forum.forum.repository;

import com.capgemini.forum.forum.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
