package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfIntegersAndStrings {

    public static void main(String[] args) {
        List<Integer> unsortedListOfIntegers = Arrays.asList(23, 1, 45, 4, 10);
        String[] array = unsortedListOfIntegers.stream().map(String::valueOf).toArray(String[]::new);
        List<String> list = Arrays.stream(array).sorted(Comparator.reverseOrder()).toList();
        System.out.println(array);
        System.out.println(list);

        List<Integer> sortedListOfIntegersInAscendingOrder = unsortedListOfIntegers.stream().sorted().toList();
        System.out.println("Before sorting  " + unsortedListOfIntegers);
        System.out.println("After sorting in ascending order " + sortedListOfIntegersInAscendingOrder);

        List<Integer> sortedListOfIntegersInDescendingOrder = unsortedListOfIntegers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("After sorting in descending order " + sortedListOfIntegersInDescendingOrder);

        List<String> unsortedListOfStrings = Arrays.asList("Java", "Maven", "Gradle", "Spring");
        List<String> sortedListOfStringsInAscendingOrder = unsortedListOfStrings.stream().sorted().toList();
        List<String> sortedListOfStringsInDescendingOrder = unsortedListOfStrings.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("After sorting in ascending order " + sortedListOfStringsInAscendingOrder);
        System.out.println("After sorting in descending order " + sortedListOfStringsInDescendingOrder);
    }

    public List<Integer> sortListOfIntegersInAscendingOrder(List<Integer> unsortedListOfIntegers) {
        if (unsortedListOfIntegers != null) {
            return unsortedListOfIntegers.stream().sorted().toList();
        }
        return Collections.emptyList();
    }
}

