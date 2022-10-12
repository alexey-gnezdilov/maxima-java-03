package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                skip(1).
                limit(cats.size() - 2).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        return cats.
                stream().
                dropWhile(Cat::isAngry).
                findFirst().
                orElse(null);
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        Stream<Cat> finalCats = onlyAngry ? cats.stream().filter(Cat::isAngry) : cats.stream();
        return finalCats.map(Cat::getWeight).reduce(Integer::sum).orElse(0);

//        return cats.stream().reduce(0,
//                (x,y)-> {
//                    if (onlyAngry) {
//                        if (y.isAngry()) {
//                            return x + y.getWeight();
//                        } else {
//                            return x;
//                        }
//                    }
//                    return x + y.getWeight();
//                },
//                Integer::sum);
    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(Cat::getFirstLetterInName));
    }
}
