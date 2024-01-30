package com.second.project.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "course")
@Entity
@Data

public class Course {

    @Id
    @Column(name= "Id")
    private int Id;

    @Column(name = "courseName")
    private String courseName;

    @Column(name = "courseDuration")
    private String courseDuration;


}
