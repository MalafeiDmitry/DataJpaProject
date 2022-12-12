package by.newhardskills.datajpa.services.impl;

import by.newhardskills.datajpa.domein.entities.Student;
import by.newhardskills.datajpa.repositories.StudentRepository;
import by.newhardskills.datajpa.services.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class StudentServiceImpl implements StudentSevice {

@Autowired
private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public long getCountofAllStudents() {
        return studentRepository.count();
    }
}
