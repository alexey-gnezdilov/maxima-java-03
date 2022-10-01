package org.example;

public class App {
    public static void main( String[] args ) {
//        System.out.println(Birthday.getAge(1993,8,24));
//        System.out.println(Birthday.nextBirthday(1993,8,24));

        try {
            CatFactory.createCat("Pepsi", 12);
            CatFactory.createCat("Pepsi", -12);
        } catch (IncorrectCatWeightException e){}
    }
}
