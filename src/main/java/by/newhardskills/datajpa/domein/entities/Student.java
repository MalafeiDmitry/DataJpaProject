package by.newhardskills.datajpa.domein.entities;

import by.newhardskills.datajpa.domein.base.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends Name {

@Column(name = "average", columnDefinition = "double precision")
    private double average;

    @Override
    public String toString() {
        return "Student{" +
                "average=" + average +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
