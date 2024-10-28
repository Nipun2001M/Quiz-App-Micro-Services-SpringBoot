package com.example.demo.dao;

import com.example.demo.model.Quiz;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
