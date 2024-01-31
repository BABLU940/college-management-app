package com.second.project.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Table(name="teachers")
@Entity
@Data

public class Teachers {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "mobileNum")
    private BigInteger mobileNum;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private float salary;


}
