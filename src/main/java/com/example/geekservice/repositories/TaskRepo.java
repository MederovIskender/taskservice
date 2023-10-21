package com.example.geekservice.repositories;
import com.example.geekservice.models.entities.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

    List<Task>findAll();

}
