package com.example.todoapp;

import com.example.todoapp.repository.ToDoRepository;
import com.example.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final ToDoRepository toDoRepository;

    @Autowired
    public SpringConfig(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    @Bean
    public ToDoService toDoService() { return new ToDoService(toDoRepository);}
}
