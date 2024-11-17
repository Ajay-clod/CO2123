package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MenuValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Menu.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Menu menu = (Menu) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "Description cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "restaurant", "", "Restaurant field cannot be empty");
        for(Menu m: Hw1Application.menus){
            if(menu.getId() == m.getId()){
                errors.rejectValue("id", "", "Menu ID is not unique");
            }
        }

    }
}
