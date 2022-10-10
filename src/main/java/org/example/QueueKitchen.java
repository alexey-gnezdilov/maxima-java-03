package org.example;

public class QueueKitchen<T> extends AnimalKitchenImpl<T>{

    @Override
    public void feed() {
        getAnimals().remove(0);
    }
}
