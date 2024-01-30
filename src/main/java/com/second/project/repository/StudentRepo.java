package com.second.project.repository;

import com.second.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    Student save(Student student);
}
