package com.second.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Data
@Table(name="student")
@Entity
public class Student {
    @Id
    @GeneratedValue

    @Column(name = "Id")
    private int studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "marks")
    private float marks;
}
