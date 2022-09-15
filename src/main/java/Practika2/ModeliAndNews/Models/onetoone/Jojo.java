package Practika2.ModeliAndNews.Models.onetoone;

import javax.persistence.*;

@Entity
@Table (name = "jojo")
public class Jojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    private Stand stand;

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

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Jojo(String name, Stand stand) {
        this.name = name;
        this.stand = stand;
    }

    public Jojo() {
    }
}