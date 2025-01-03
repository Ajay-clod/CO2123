package co2123.hw2.repo;

import co2123.hw2.model.Website;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebsiteRepository extends CrudRepository<Website, String> {
    List<Website> findByAddress(String address);
}
