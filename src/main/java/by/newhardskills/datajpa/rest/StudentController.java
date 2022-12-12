package by.newhardskills.datajpa.rest;


import by.newhardskills.datajpa.domein.entities.Student;
import by.newhardskills.datajpa.services.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentSevice studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/count")
    public long getCountOgAllStudents(){
        return studentService.getCountofAllStudents();
    }

}
