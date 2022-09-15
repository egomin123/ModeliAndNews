package Practika2.ModeliAndNews.Repository;

import Practika2.ModeliAndNews.Models.manytomany.Noyt;
import org.springframework.data.repository.CrudRepository;

public interface NoytRepository  extends CrudRepository<Noyt, Long> {
    Noyt findByName(String name);
}

