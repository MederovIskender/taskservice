package com.example.geekservice.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Task {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String description;

    boolean completed;

    boolean created;

}
