package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatStatistics {

    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        return cats.
                stream().
                sorted(Comparator.comparing(Cat::getName)).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        return cats.
                stream().
                sorted(Comparator.comparing(Cat::getWeight).reversed()).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) {
        return cats.
                stream().
                filter(cat -> cats.indexOf(cat) != 0 || cats.indexOf(cat) != (cats.size() - 1)).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        return cats.
                stream().
                filter(p -> !p.isAngry()).
                findFirst().
                orElse(null);
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        return cats.stream().reduce(0,
                (x,y)-> {
                    if (onlyAngry) {
                        if (y.isAngry()) {
                            return x + y.getWeight();
                        } else {
                            return x;
                        }
                    }
                    return x + y.getWeight();
                },
                Integer::sum);
    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(Cat::getFirstLetterInName));
    }
}
