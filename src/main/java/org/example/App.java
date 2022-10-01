package org.example;

import org.example.cat.CatFactory;

public class App {
    public static void main( String[] args ) {
//        System.out.println(Birthday.getAge(1993,8,24));
//        System.out.println(Birthday.nextBirthday(1993,8,24));
        try {
            CatFactory.createCat("Pepsi", 12);
            CatFactory.createCat("Cola", -12);
        } catch (Exception e) {
            System.out.println("Поменяйте вес кота!");
        }
    }
}
