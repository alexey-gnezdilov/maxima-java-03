package org.example;

public class Cat {

    private String name;
    private int weight;
    private boolean isAngry;

    public Cat(String name, int weight, boolean isAngry) throws IncorrectCatWeightException {
        this.name = name;
        this.isAngry = isAngry;
        setWeight(weight);
    }

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
        if (weight <= 0)
            throw new IncorrectCatWeightException();
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
