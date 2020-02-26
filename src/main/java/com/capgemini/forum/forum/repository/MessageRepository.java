package com.capgemini.forum.forum.repository;

import com.capgemini.forum.forum.models.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Messages,Long> {
}
