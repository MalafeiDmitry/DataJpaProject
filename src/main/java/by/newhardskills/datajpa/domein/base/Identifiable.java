package by.newhardskills.datajpa.domein.base;


import javax.persistence.*;

@MappedSuperclass
public abstract class Identifiable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id",columnDefinition = "bigint")
    protected long id;
}
