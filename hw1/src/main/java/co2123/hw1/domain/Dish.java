package co2123.hw1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dish {
    @Id
    private String name;
    private String type;
    private String dietary;
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDietary() {
        return this.dietary;
    }

    public void setDietary(String dietary) {
        this.dietary = dietary;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
