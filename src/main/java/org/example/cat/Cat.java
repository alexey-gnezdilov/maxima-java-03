package org.example.cat;

public class Cat {

    private String name;
    private int weight;
    private boolean isAngry;

    public Cat(String name, int weight) throws IncorrectCatWeightException{

        this.name = name;

        if (weight > 0) {
            this.weight = weight;
            this.isAngry = false;
        } else {
            this.weight = 5;
            this.isAngry = true;
            throw new IncorrectCatWeightException();
        }
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
