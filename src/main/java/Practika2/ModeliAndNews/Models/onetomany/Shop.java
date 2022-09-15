package Practika2.ModeliAndNews.Models.onetomany;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Shop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String building;

    @OneToMany(mappedBy = "shop", fetch = FetchType.EAGER)
    private Collection<Tc> tc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Collection<Tc> getTc() {
        return tc;
    }

    public void setTc(Collection<Tc> tc) {
        this.tc = tc;
    }
}
