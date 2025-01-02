package br.com.samuelsales.todolist.task;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private Long id;
    @Column(length = 50)
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Priority priority;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUser;

}
