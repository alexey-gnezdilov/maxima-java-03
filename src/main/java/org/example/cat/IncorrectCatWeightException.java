package org.example.cat;

public class IncorrectCatWeightException extends Exception{
    public IncorrectCatWeightException() {
        System.out.println("Вес кота не может быть отрицательным!");
    }
}
