package com.example.geekservice.services;

import com.example.geekservice.models.dtos.TaskDto;
import com.example.geekservice.models.entities.Task;
import com.example.geekservice.repositories.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    TaskRepo taskRepo;

    @Override
    public List<TaskDto> getAllTasks() {
        return TaskDto.toDto(taskRepo.getAll);
    }

    @Override
    public void saveTask(TaskDto task) {
        taskRepo.save(TaskDto.toEntity(task));

    }

    @Override
    public TaskDto updateTask(Long id, TaskDto taskDto) {
        Task task = taskRepo.findById(id);

    }

    @Override
    public TaskDto deleteTask(Long id) {
        return null;
    }
}
