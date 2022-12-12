package by.newhardskills.datajpa.services;

import by.newhardskills.datajpa.domein.entities.Student;

import java.util.List;

public interface StudentSevice {
    List<Student> getAllStudents();

    long getCountofAllStudents();


}
