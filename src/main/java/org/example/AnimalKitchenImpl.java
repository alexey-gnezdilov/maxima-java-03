package org.example;

import java.util.ArrayList;

public class AnimalKitchenImpl<T> implements AnimalKitchen<T>{

    private ArrayList<T> animals = new ArrayList<>();

    public ArrayList<T> getAnimals() {
        return animals;
    }

    @Override
    public void add(T animal) {
        getAnimals().add(animal);
    }

    @Override
    public void feed() {}
}
