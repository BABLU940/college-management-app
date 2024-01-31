package com.second.project.Controller;


import com.second.project.Services.StudentService;
import com.second.project.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/p")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        return studentService.saveDetails(student);

    }
    @PutMapping("/updateStudentDetail")
    public Student updateDetails(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        return studentService.deleteStudent(studentId);
    }
}