package com.example.geekservice.controllers;

import com.example.geekservice.models.dtos.TaskDto;
import com.example.geekservice.models.entities.Task;
import com.example.geekservice.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/service")
public class TaskController {
    TaskService taskService;

    @GetMapping("/getall")
    public List<TaskDto> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping("/create")
    public TaskDto saveTask(TaskDto taskDto){
        return taskService.saveTask(taskDto);
    }

    public TaskDto  (){

    }


}
