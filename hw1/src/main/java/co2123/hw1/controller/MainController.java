package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @PostMapping("/postStart")
    public String postStart() {
        return "start";
    }
    @RequestMapping("/getStart")
    public String getStart () {
        return "start";
    }
}
