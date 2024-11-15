package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;


public class Menu {

    private int id;
    private String description;
    private String restaurant;

    private List<Dish> dishes;

    public Menu() {
        this.dishes = new ArrayList<Dish>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
