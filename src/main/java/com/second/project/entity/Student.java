package com.second.project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="student")
@Entity
public class Student {
    @Id
    @Column(name = "id")
    private int studentId;

    @Column(name = "marks")
    private int marks;

    @Column(name = "name")
    private String name;
}
