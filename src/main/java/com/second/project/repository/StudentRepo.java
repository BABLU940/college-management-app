package com.second.project.repository;

import com.second.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo {
    Student save(Student student);
}
