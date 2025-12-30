package com.javanauta.taskscheduler.infrastructure.repository;

import com.javanauta.taskscheduler.infrastructure.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}
