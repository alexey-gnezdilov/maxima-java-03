package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatStatistics {

    public static List<Cat> sortByNameAscending(List<Cat> cats) {
        return cats.
                stream().
                sorted(Comparator.comparing(Cat::getName)).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Cat> sortByWeightDescending(List<Cat> cats) {
        return cats.
                stream().
                sorted(Comparator.comparing(Cat::getWeight).reversed()).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Cat> removeFirstAndLast (List<Cat> cats) {
        return cats.
                stream().
                skip(1).
                limit(cats.size() - 2).
                collect(Collectors.toCollection(ArrayList::new));
    }

    public static Cat findFirstNonAngryCat (List<Cat> cats) {
        return cats.
                stream().
                dropWhile(Cat::isAngry).
                findFirst().
                orElse(null);
    }

    public static int getCommonWeight(List<Cat> cats, boolean onlyAngry) {
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

    public static Map<String, List<Cat>> groupCatsByFirstLetter (List<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(Cat::getFirstLetterInName));
    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter2 (List<Cat> cats) {
        return cats
                .stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(s -> s.getName().substring(0,1)));
    }
}
