package co2123.hw2.controller;

import co2123.hw2.repo.FavouriteRepository;
import co2123.hw2.repo.ProgrammerRepository;
import co2123.hw2.repo.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        websiteRepository.deleteAll(websiteRepository.findByAddress(address));
        return "redirect:/";
    }

    @RequestMapping("deleteFavourite")
    public String deleteFavourite(@RequestParam int identifier) {

        favouriteRepository.findById(identifier).ifPresent(favouriteRepository::delete);
        return "redirect:/";
    }


}
