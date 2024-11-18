package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    private final MissingInteger missingInteger = new MissingInteger();

    @Test
    void testBasicCase() {
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    void testAllPositiveConsecutive() {
        assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
    }

    @Test
    void testAllNegativeIntegers() {
        assertEquals(1, missingInteger.solution(new int[]{-1, -3, -5, -6}));
    }

    @Test
    void testMixedPositiveAndNegativeWithoutOne() {
        assertEquals(1, missingInteger.solution(new int[]{-1, -3, 2, 3, 4}));
    }

    @Test
    void testSingleElementPositive() {
        assertEquals(2, missingInteger.solution(new int[]{1}));
    }

    @Test
    void testSingleElementNegative() {
        assertEquals(1, missingInteger.solution(new int[]{-1}));
    }

    @Test
    void testSingleElementZero() {
        assertEquals(1, missingInteger.solution(new int[]{0}));
    }

    @Test
    void testGapInPositiveIntegers() {
        assertEquals(4, missingInteger.solution(new int[]{1, 2, 6, 3, 7, 8}));
    }

    @Test
    void testLargeNumbers() {
            assertEquals(1, missingInteger.solution(new int[]{100000, 99999, 100001}));
    }

    @Test
    void testRepeatedElements() {
        assertEquals(2, missingInteger.solution(new int[]{1, 1, 1, 3, 3, 3}));
    }

    @Test
    void testMissingFirstPositiveInteger() {
        assertEquals(1, missingInteger.solution(new int[]{2, 3, 4, 5}));
    }

    @Test
    void testArrayWithMaxSize() {
        int[] maxArray = new int[100000];
        for (int i = 0; i < 100000; i++) {
            maxArray[i] = i + 1; // Array of consecutive numbers from 1 to 100000
        }
        assertEquals(100001, missingInteger.solution(maxArray));
    }

    @Test
    void testArrayWithLargeNegativeAndPositiveNumbers() {
        assertEquals(1, missingInteger.solution(new int[]{-1000000, 1000000, 2, 3}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(1, missingInteger.solution(new int[]{}));
    }
}