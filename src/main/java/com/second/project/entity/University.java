package com.second.project.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Table(name="university")
@Entity
@Data

public class University {

    @Id
    @Column(name = "Id")
    private int Id;

    @Column(name = "universityName")
    private String universityName;

    @Column(name = "universityAddress")
    private String universityAddress;

    @Column(name = "universityMobileNo")
    private BigInteger universityMobileNo;

}
