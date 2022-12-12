package by.newhardskills.datajpa.domein.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Name extends Identifiable{

    @Column(name = "name", columnDefinition = "varchar(255)")
    protected String name;
}
