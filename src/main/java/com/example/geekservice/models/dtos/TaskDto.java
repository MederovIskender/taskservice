package com.example.geekservice.models.dtos;

import com.example.geekservice.models.entities.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskDto {
    Long id;

    String title;

    String description;

    boolean completed;

    boolean created;

    public static Task toEntity(TaskDto dto){
        return Task.builder().id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.isCompleted())
                .created(dto.isCreated()).build();
    }
    public static TaskDto toDto(Task task){
        return TaskDto.builder()
                .id(task.getId())
                .description(task.getDescription())
                .completed(task.isCompleted())
                .created(task.isCreated()).build();
    }
}
