package com.second.project.Services;


import com.second.project.entity.Student;
import com.second.project.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
