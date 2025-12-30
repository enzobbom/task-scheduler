package com.javanauta.taskscheduler.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.javanauta.taskscheduler.infrastructure.enums.NotificationStatusEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDTO {

    private String id;
    private String name;
    private String description;
    private LocalDateTime creationDateTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dueDateTime;
    private String userEmail;
    private LocalDateTime modificationDateTime;
    private NotificationStatusEnum notificationStatusEnum;
}
