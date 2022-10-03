package org.example;

public class App {
    public static void main( String[] args ) {
        new TextTransformer().transform("fileIn.csv","fileOut.txt");
    }
}
