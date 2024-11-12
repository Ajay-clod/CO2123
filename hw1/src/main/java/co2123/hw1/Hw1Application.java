package co2123.hw1;

import co2123.hw1.domain.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Hw1Application {
    public static List<Menu> menus;
    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

}
