package Practika2.ModeliAndNews.Models.manytomany;


import javax.persistence.*;
import java.util.List;

@Entity
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;



    @ManyToMany
    @JoinTable (name="person_noyt",
            joinColumns=@JoinColumn (name="person_id"),
            inverseJoinColumns=@JoinColumn(name="noyt_id"))
    private List<Noyt> noyt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Noyt> getNoyt() {
        return noyt;
    }

    public void setUniversities(List<Noyt> universities) {
        this.noyt = noyt;
    }


}
