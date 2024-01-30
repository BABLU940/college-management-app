package Services;


import com.second.project.entity.Student;
import com.second.project.repository.StudentRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {

    @Autowired
    private StudentRepoImp studentRepoImp;

    public Student saveDetails(Student student){
        StudentRepoImp studentRepoImp = new StudentRepoImp();
        return studentRepoImp.save(student);


    }

}
