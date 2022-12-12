package by.newhardskills.datajpa.repositories;

import by.newhardskills.datajpa.domein.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
