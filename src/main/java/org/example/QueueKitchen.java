package org.example;

import java.util.ArrayList;
import java.util.List;

public class QueueKitchen<T> implements AnimalKitchen<T>{

    List<T> animals = new ArrayList<>();

    @Override
    public void add(T animal) {
        animals.add(animal);
    }

    @Override
    public void feed() {
        animals.remove(0);
    }
}
