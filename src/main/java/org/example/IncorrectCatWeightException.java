package org.example;

public class IncorrectCatWeightException extends Exception{
    public IncorrectCatWeightException() {
        System.out.println("Вес кота не может быть отрицательным!");
    }
}
