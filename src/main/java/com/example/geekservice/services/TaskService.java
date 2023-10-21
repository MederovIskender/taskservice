package com.example.geekservice.services;

import com.example.geekservice.models.dtos.TaskDto;
import com.example.geekservice.models.entities.Task;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAllTasks();

    void saveTask(TaskDto task);

    TaskDto updateTask(Long id, TaskDto task);

    TaskDto deleteTask(Long id);
}
