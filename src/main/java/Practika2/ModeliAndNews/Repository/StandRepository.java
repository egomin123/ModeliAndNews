package Practika2.ModeliAndNews.Repository;

import Practika2.ModeliAndNews.Models.onetoone.Stand;
import org.springframework.data.repository.CrudRepository;

public interface StandRepository extends CrudRepository<Stand,Long> {

    Stand findByIma(String ima);
}