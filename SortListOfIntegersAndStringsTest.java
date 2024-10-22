package main.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListOfIntegersAndStringsTest {

    private final SortListOfIntegersAndStrings sortListOfIntegersAndStrings = new SortListOfIntegersAndStrings();

    @Test
    void givenListOfIntegers_WhenSortedInAscendingOrder_ReturnsSortedListOfIntegers() {
        //Arrange
        List<Integer> unsortedListOfIntegers = Arrays.asList(23, 1, 45, 4, 10);
        List<Integer> expected = Arrays.asList(1, 4, 10, 23, 45);

        //Act
        var actual = sortListOfIntegersAndStrings.sortListOfIntegersInAscendingOrder(unsortedListOfIntegers);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void givenNull_WhenSortedInAscendingOrder_ReturnsEmptyList() {
        //Act
        var actual = sortListOfIntegersAndStrings.sortListOfIntegersInAscendingOrder(null);

        //Assert
        assertEquals(emptyList(), actual);
    }

    @Test
    void givenEmptyList_WhenSortedInAscendingOrder_ReturnsEmptyList() {
        //Act
        var actual = sortListOfIntegersAndStrings.sortListOfIntegersInAscendingOrder(emptyList());

        //Assert
        assertEquals(emptyList(), actual);
    }
}
