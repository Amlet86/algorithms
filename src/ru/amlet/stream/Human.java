package ru.amlet.stream;

import java.util.List;

public class Human {

    private String name;
    private List<String> pets;

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

}
