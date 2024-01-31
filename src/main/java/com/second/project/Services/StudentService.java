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
    public Student updateStudent(Student student){
        Student updateDetails = studentRepo.findById(student.getStudentId()).orElse(null);
        if(updateDetails != null){
            updateDetails.setName(student.getName());
            updateDetails.setMarks(student.getMarks());
            studentRepo.save(updateDetails);
            return (updateDetails);
        }
        return null;
    }

    public String deleteStudent(Integer studentId){
        studentRepo.deleteById(studentId);
        return "Record Delete";
    }

}
