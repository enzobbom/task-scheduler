package com.javanauta.ts.taskscheduler.business.mapper;

import com.javanauta.ts.taskscheduler.business.dto.TaskDTO;
import com.javanauta.ts.taskscheduler.infrastructure.entity.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskConverter {

    Task toTask(TaskDTO taskDTO);
    TaskDTO toTaskDTO(Task task);
    List<Task> toTaskList(List<TaskDTO> taskDTOList);
    List<TaskDTO> toTaskDTOList(List<Task> taskList);
}
