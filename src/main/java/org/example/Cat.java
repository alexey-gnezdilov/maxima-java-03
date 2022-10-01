package org.example;

public class Cat {

    private String name;
    private int weight;
    private boolean isAngry;

    public Cat() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws IncorrectCatWeightException{
        if (weight > 0)
            this.weight = weight;
        else
            throw new IncorrectCatWeightException();
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
