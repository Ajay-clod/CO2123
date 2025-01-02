package co2123.hw2.repo;

import co2123.hw2.model.Favourite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FavouriteRepository extends CrudRepository<Favourite, Integer> {
    List<Favourite> findByVisits(int visits);
}


