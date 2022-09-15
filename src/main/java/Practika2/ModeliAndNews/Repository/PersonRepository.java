package Practika2.ModeliAndNews.Repository;

import Practika2.ModeliAndNews.Models.manytomany.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository  extends CrudRepository<Person, Long> {
    Person findByName(String name);
}
