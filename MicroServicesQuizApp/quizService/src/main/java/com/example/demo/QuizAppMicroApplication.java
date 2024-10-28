package com.example.demo;

import com.example.demo.dao.QuizDao;
import com.example.demo.feign.QuizInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class QuizAppMicroApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizAppMicroApplication.class, args);
	}

}
