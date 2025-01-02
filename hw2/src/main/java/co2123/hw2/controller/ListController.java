package co2123.hw2.controller;

import co2123.hw2.model.Favourite;
import co2123.hw2.model.Programmer;
import co2123.hw2.model.Website;
import co2123.hw2.repo.FavouriteRepository;
import co2123.hw2.repo.ProgrammerRepository;
import co2123.hw2.repo.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ListController {
    @Autowired
    ProgrammerRepository programmerRepository;
    @Autowired
    FavouriteRepository favouriteRepository;
    @Autowired
    WebsiteRepository websiteRepository;

    @RequestMapping("/listProgrammer")
    public String listProgrammer(Model model) {
        ArrayList programmers = new ArrayList();
        for (Programmer programmer : programmerRepository.findAll()) {
            programmers.add(programmer.toString());
        }
        model.addAttribute("data", programmers);
        return "list";
    }
    @RequestMapping("/listWebsite")
    public String listWebsite(Model model) {
        ArrayList websites = new ArrayList();
        for (Website website : websiteRepository.findAll()) {
            websites.add(website.toString());
        }
        model.addAttribute("data", websites);
        return "list";
    }
    @RequestMapping("/listFavourite")
    public String listFavourite(Model model) {
        ArrayList favourites = new ArrayList();
        for (Favourite favourite : favouriteRepository.findAll()) {
            favourites.add(favourite.toString());
        }
        model.addAttribute("data", favourites);
        return "list";
    }
}
