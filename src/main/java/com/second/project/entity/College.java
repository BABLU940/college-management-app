package com.second.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "college")
@Data
@Entity
public class College {
    @Id
    @Column(name= "Id")
    private int Id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="mob")
    private int mob;
}
