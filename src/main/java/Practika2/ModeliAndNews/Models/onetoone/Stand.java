package Practika2.ModeliAndNews.Models.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "stand")
public class Stand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ima;
    private String skill;
    @OneToOne(optional = true, mappedBy = "stand")
    private Jojo owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Jojo getOwner() {
        return owner;
    }

    public void setOwner(Jojo owner) {
        this.owner = owner;
    }
}
