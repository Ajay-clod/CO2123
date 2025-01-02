package co2123.hw2.repo;

import co2123.hw2.model.Programmer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {
    List<Programmer> findByName(String name);
    List<Programmer> findByPopularAddress(String address);
}
