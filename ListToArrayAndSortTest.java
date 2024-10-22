package main.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ListToArrayAndSortTest {

    private final ListToArrayAndSort listToArrayAndSort = new ListToArrayAndSort();

    @Test
    void givenListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnSortedArrayOfStrings() {
        //Arrange
        List<Integer> numbers = Arrays.asList(5, 12, 43, 67, 1, 10, 200);
        String[] expected = new String[] {"200", "67", "43", "12", "10", "5", "1"};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(numbers, "");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenNull_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnEmptyArray() {
        //Arrange
        String[] expected = new String[] {};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(null, "");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenEmptyListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnEmptyArray() {
        //Arrange
        String[] expected = new String[] {};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(emptyList(), "");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnMultiplesOf3() {
        //Arrange
        List<Integer> numbers = Arrays.asList(5, 12, 43, 67, 1, 10, 200);
        String[] expected = new String[] {"12"};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(numbers, "multiples-of-3");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnDoubleDigits() {
        //Arrange
        List<Integer> numbers = Arrays.asList(5, 12, 43, 67, 1, 10, 200);
        String[] expected = new String[] {"67", "43", "12", "10"};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(numbers, "double-digits");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnSingleDigit() {
        //Arrange
        List<Integer> numbers = Arrays.asList(5, 12, 43, 67, 1, 10, 200);
        String[] expected = new String[] {"5", "1"};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(numbers, "single-digit");

        //Assert
        assertArrayEquals(expected, result);
    }

    @Test
    void givenListOfNumbers_WhenConvertToArraysOfStringsAndSortInDescendingOrder_ThenReturnMultipleZeroes() {
        //Arrange
        List<Integer> numbers = Arrays.asList(50, 1200, 43000, 67, 1, 10, 200);
        String[] expected = new String[] {"43000", "1200", "200"};

        //Act
        String[] result = listToArrayAndSort.getSortedArray(numbers, "multiple-zeroes");

        //Assert
        assertArrayEquals(expected, result);
    }
}