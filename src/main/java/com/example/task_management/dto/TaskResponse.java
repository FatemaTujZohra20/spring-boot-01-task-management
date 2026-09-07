package com.example.task_management.dto;

import com.example.task_management.enums.TaskPriority;
import com.example.task_management.enums.TaskStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaskResponse {
    
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
}
