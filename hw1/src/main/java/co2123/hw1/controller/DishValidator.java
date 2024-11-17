package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;

public class DishValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Dish.class.equals(clazz);
    }
    @Override
    public void validate(Object target, Errors errors) {
        Dish dish = (Dish) target;
        List<String> dietaryChoices = Arrays.asList("Vegetarian", "Vegan", "Lactose Free");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Dish name cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Dish Type cannot be empty");

        if(!dietaryChoices.contains(dish.getDietary())){
            errors.rejectValue("dietary", "", "Invalid Dietary Choice");
        }

        if(!(dish.getPrice() >= 5 && dish.getPrice() <= 15)){
            errors.rejectValue("price", "", "Dish must cost between £5 and £15");
        }


    }
}
