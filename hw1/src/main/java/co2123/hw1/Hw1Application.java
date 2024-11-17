package co2123.hw1;

import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
    public static List<Menu> menus;
    public static void main(String[] args) {SpringApplication.run(Hw1Application.class, args);}

    @Override
    public void run(String... args){
        menus = new ArrayList<>();
        //Menu Initialization
        Menu menu = new Menu();
        menu.setDescription("A delicious variety of plant-based meals for vegetarian diners.");
        menu.setId(0);
        menu.setRestaurant("Ember & Bloom");
        menus.add(menu);

        Dish dish = new Dish();

        //Risotto dish
        dish.setType("Main Course");
        dish.setPrice(18);
        dish.setDietary("Vegetarian");
        dish.setName("Saffron and Lemongrass Risotto");
        menu.getDishes().add(dish);

        dish = new Dish();
        //Beet Tartare dish
        dish.setType("Appetizer");
        dish.setPrice(12);
        dish.setDietary("Vegan");
        dish.setName("Fire-Roasted Beet Tartare");
        menu.getDishes().add(dish);
    }

}
