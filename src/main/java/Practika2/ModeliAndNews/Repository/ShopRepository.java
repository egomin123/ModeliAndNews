package Practika2.ModeliAndNews.Repository;

import Practika2.ModeliAndNews.Models.onetomany.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository  extends CrudRepository<Shop,Long> {
    Shop findByStreet(String street);
}