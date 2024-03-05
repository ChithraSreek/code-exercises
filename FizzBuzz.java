package main.java;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        int end = 100;
        IntStream.rangeClosed(1, end)
                .mapToObj(
                        i -> i % 5 == 0 ?
                                (i % 7 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public static String fizzBuzz2(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } return String.valueOf(number);
    }

}
