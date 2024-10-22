package main.java;

import java.util.Comparator;
import java.util.List;

public class ListToArrayAndSort {
    public String[] getSortedArray(List<Integer> numbers, String condition) {
        if (numbers != null) {
            Comparator<String> customComparator = (a, b) -> {
                int numA = Integer.parseInt(a);
                int numbB = Integer.parseInt(b);
                return Integer.compare(numbB, numA);
            };
            return numbers.stream()
                    .map(String::valueOf)
                    .sorted(customComparator)
                    .filter(num -> switch (condition) {
                        case "multiples-of-3" -> Integer.parseInt(num) % 3 == 0;
                        case "single-digit" -> Integer.parseInt(num) < 10;
                        case "multiple-zeroes" -> num.length() - num.replace("0", "").length() > 1;
                        case "double-digits" -> {
                            int number = Integer.parseInt(num);
                            yield number >= 10 && number < 100;
                        }
                        default -> true;
                    })
                    .toArray(String[]::new);
        }
        return new String[] {};
    }
}
