package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatStatistics {

    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        return (ArrayList<Cat>) cats.stream().sorted(Comparator.comparing(Cat::getName));
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        return (ArrayList<Cat>) cats.stream().sorted(Comparator.comparing(Cat::getWeight).reversed());
    }

    public static ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) {
        return (ArrayList<Cat>) cats.stream().filter(cat -> cats.indexOf(cat) != 0 || cats.indexOf(cat) != (cats.size() - 1));
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        return cats.stream().filter(p -> !p.isAngry()).findFirst().orElse(null);
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        if (onlyAngry) {
            return cats.stream().filter(Cat::isAngry).map(Cat::getWeight).reduce(Integer::sum).orElse(0);
        }
        return cats.stream().map(Cat::getWeight).reduce(Integer::sum).orElse(0);
    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(Cat::getFirstLetterInName));
    }
}
