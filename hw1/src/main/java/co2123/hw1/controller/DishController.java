package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Queue;

@Controller
public class DishController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new DishValidator());
    }

    @GetMapping("/dishes")
    public String showDishes(Model model, @RequestParam int menu) {
        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menu) {
                model.addAttribute("dishes", m.getDishes());
            }
        }
        return "dishes/list";
    }

    @GetMapping("/newDish")
    public String newDish(Model model, @RequestParam int menu) {
        model.addAttribute("dish", new Dish());// Prepare a new dish for the form
        return "dishes/form";
    }


    @PostMapping("/addDish")
    public String addDish(Model model, @RequestParam int menu, @Valid @ModelAttribute("dish") Dish dish, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "dishes/form";
        }

        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menu) {
                m.getDishes().add(dish);
            }
        }

        return "redirect:/menus";
    }

}
