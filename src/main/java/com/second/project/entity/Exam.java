package com.second.project.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="exam")
@Data
@Entity
public class Exam {
    @Id
    @Column(name= "Id")
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "examName")
    private String examName;

    @Column(name = "address")
    private String address;

    @Column(name = "examCenter")
    private String examCenter;

}
