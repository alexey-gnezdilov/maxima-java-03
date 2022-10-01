package org.example.cat;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException{
        return new Cat(name, weight);
    }
}
