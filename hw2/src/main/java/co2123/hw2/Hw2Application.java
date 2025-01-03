package co2123.hw2;

import co2123.hw2.model.Favourite;
import co2123.hw2.model.Programmer;
import co2123.hw2.model.Website;
import co2123.hw2.repo.FavouriteRepository;
import co2123.hw2.repo.ProgrammerRepository;
import co2123.hw2.repo.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {
    @Autowired
    public FavouriteRepository favouriteRepository;
    @Autowired
    public ProgrammerRepository programmerRepository;
    @Autowired
    public WebsiteRepository websiteRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Favourite favourite1 = new Favourite();
        favourite1.setIdentifier(1);
        favourite1.setVisits(100);
        favouriteRepository.save(favourite1);

        Favourite favourite2 = new Favourite();
        favourite2.setIdentifier(2);
        favourite2.setVisits(200);
        favouriteRepository.save(favourite2);

        // Create Website instances
        Website website1 = new Website();
        website1.setAddress("example.com");
        website1.setFavourites(new ArrayList<>(List.of(favourite1)));
        website1.setRecent(favourite1);
        websiteRepository.save(website1);

        Website website2 = new Website();
        website2.setAddress("testsite.com");
        website2.setFavourites(new ArrayList<>(List.of(favourite2)));
        website2.setRecent(favourite2);
        websiteRepository.save(website2);

        // Create Programmer instances
        Programmer programmer1 = new Programmer();
        programmer1.setId(1);
        programmer1.setName("Alice");
        programmer1.setWebsites(new ArrayList<>(List.of(website1, website2)));
        programmer1.setPopular(website1);
        programmerRepository.save(programmer1);

        Programmer programmer2 = new Programmer();
        programmer2.setId(2);
        programmer2.setName("Bob");
        programmer2.setWebsites(new ArrayList<>(List.of(website2)));
        programmer2.setPopular(website2);
        programmerRepository.save(programmer2);


    }
}
