package org.example;

public class App {
    public static void main( String[] args ) {
//        System.out.println(Birthday.getAge(1993,8,24));
//        System.out.println(Birthday.nextBirthday(1993,8,24));

        try {
            Cat cat1 = CatFactory.createCat("Pepsi", 12);
            Cat cat2 = CatFactory.createCat("Pepsi", -12);
            Cat cat3 = CatFactory.createCat("Pepsi", -13);
        } catch (IncorrectCatWeightException e){}
    }
}
