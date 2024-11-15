package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new MenuValidator());
    }

    @GetMapping("/menus")
    public String getMenuList(Model model) {
        model.addAttribute("menus", Hw1Application.menus);
        return "menus/list";
    }

    @GetMapping("/newMenu")
    public String newMenu(Model model) {
        model.addAttribute("menu", new Menu());
        return "menus/form";
    }

    @PostMapping("/addMenu")
    public String addMenu(@Valid @ModelAttribute Menu menu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "menus/form";
        }
        Hw1Application.menus.add(menu);
        return "redirect:/menus";
    }

}
