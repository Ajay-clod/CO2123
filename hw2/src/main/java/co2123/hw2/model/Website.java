package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Website {
    @Id
    private String address;
    @ManyToMany(mappedBy = "websites")
    private List<Programmer> programmers;
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Favourite> favourites;

    @OneToOne
    private Favourite recent;

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(List<Programmer> programmers) {
        this.programmers = programmers;
    }

    public List<Favourite> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Favourite> favourites) {
        this.favourites = favourites;
    }

    public Favourite getRecent() {
        return recent;
    }

    public void setRecent(Favourite recent) {
        this.recent = recent;
    }

    // toString method
    @Override
    public String toString() {
        return "address='" + address + "', favourites=" + favourites + ", recent=" + recent;
    }
}