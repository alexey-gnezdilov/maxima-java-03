package org.example;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException{

        Cat cat = null;

        try {
            cat = new Cat();
            cat.setName(name);
            cat.setWeight(weight);
            cat.setAngry(false);
        } catch (IncorrectCatWeightException e) {
            cat.setWeight(5);
            cat.setAngry(true);
        }
        return cat;
    }
}
