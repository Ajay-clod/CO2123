package co2123.hw2.controller;

import co2123.hw2.model.Favourite;
import co2123.hw2.model.Programmer;
import co2123.hw2.model.Website;
import co2123.hw2.repo.FavouriteRepository;
import co2123.hw2.repo.ProgrammerRepository;
import co2123.hw2.repo.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class DeleteController {

    @Autowired
    ProgrammerRepository programmerRepository;

    @Autowired
    WebsiteRepository websiteRepository;

    @Autowired
    FavouriteRepository favouriteRepository;

    @RequestMapping("deleteProgrammer")
    public String deleteProgrammer(@RequestParam int id) {
        programmerRepository.findById(id).ifPresent(programmerRepository::delete);
        return "redirect:/";
    }

    @RequestMapping("deleteWebsite")
    public String deleteWebsite(@RequestParam String address) {
        Optional<Website> website = websiteRepository.findById(address);
        if (website.isPresent()) {
            Website w = website.get();
            List<Programmer> p = w.getProgrammers();
            programmerRepository.deleteAll(p);
            websiteRepository.deleteById(address);
        }
        return "redirect:/";
    }

    @RequestMapping("deleteFavourite")
    public String deleteFavourite(@RequestParam int identifier) {
        favouriteRepository.findById(identifier).ifPresent(favourite -> {
            List<Website> websites = (List<Website>) websiteRepository.findAll();
            for (Website website : websites) {
                if (website.getRecent() != null && website.getRecent().getIdentifier() == favourite.getIdentifier()) {
                    website.setRecent(null);
                    websiteRepository.save(website);
                }
                if (website.getFavourites().contains(favourite)) {
                    website.getFavourites().remove(favourite);
                    websiteRepository.save(website);
                }
            }
            favouriteRepository.delete(favourite);
        });
        return "redirect:/";
    }

}
