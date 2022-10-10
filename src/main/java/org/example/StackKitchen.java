package org.example;

public class StackKitchen<T> extends AnimalKitchenImpl<T>{

    @Override
    public void feed() {
        getAnimals().remove(getAnimals().size() - 1);
    }
}
