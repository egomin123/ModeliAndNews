package Practika2.ModeliAndNews.Models.onetomany;


import javax.persistence.*;

@Entity
@Table(name = "tc")
public class Tc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Shop shop;

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

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Tc(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    public Tc() {
    }
}
