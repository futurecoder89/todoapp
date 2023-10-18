package com.example.todoapp.service;

import com.example.todoapp.domain.ToDo;
import com.example.todoapp.repository.ToDoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ToDoService {
    private final ToDoRepository toDoRepository;
    public ToDoService(ToDoRepository toDoRepository) {this.toDoRepository = toDoRepository;}

    public List<ToDo> findAll() {


        return toDoRepository.findAll();

    }

}
