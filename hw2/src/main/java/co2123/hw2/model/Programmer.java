package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Website> websites;

    @ManyToOne
    private Website popular;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public Website getPopular() {
        return popular;
    }

    public void setPopular(Website popular) {
        this.popular = popular;
    }

    // toString method
    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + "', websites=" + websites + "popular=" + popular ;
    }
}