package com.capgemini.forum.forum.repository;

import com.capgemini.forum.forum.models.Topics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topics,Long> {
}
