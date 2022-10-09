package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class CatStatistics {

    private static final ArrayList<Cat> sortedCats = new ArrayList<>();

    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        sortedCats.addAll(cats);
        //sortedCats.stream().sorted(Comparator.comparing(Cat::getName)); - Result of 'Stream.sorted()' is ignored
        sortedCats.sort(Comparator.comparing(Cat::getName));
        return sortedCats;
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        sortedCats.addAll(cats);
        sortedCats.sort(Comparator.comparing(Cat::getWeight).reversed());
        return sortedCats;
    }

    public static ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) {
        sortedCats.addAll(cats);
        sortedCats.removeIf(p -> sortedCats.indexOf(p) == 0 || sortedCats.indexOf(p) == (sortedCats.size() - 1));
        return sortedCats;
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        sortedCats.addAll(cats);
        return sortedCats.stream().filter(p -> !p.isAngry()).findFirst().orElse(null);
    }
}
