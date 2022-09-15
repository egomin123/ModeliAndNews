package Practika2.ModeliAndNews.Models.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Noyt {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @ManyToMany
    @JoinTable(name="person_noyt",
            joinColumns=@JoinColumn(name="noyt_id"),
            inverseJoinColumns=@JoinColumn(name="person_id"))
    private List<Person> person;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setStudents(List<Person> person) {
        this.person = person;
    }

}
