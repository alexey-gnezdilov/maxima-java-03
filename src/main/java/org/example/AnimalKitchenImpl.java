package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalKitchenImpl<T> implements AnimalKitchen<T>{

    private List<T> animals = new ArrayList<>();

    public List<T> getAnimals() {
        return animals;
    }

    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    public void feed() {}
}
