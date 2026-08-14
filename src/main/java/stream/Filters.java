package stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Filters {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 6, 3, 8, 9);

        // get number which is more than 3
        System.out.println("Numbers greater than 3");
        numbers.stream()
                .filter(e -> e > 3)
                .forEach(System.out::println);

        // Get all even numbers
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        // sort in ascending order means natural number order
        System.out.println("Numbers in ascending order:");

        numbers.stream().sorted().forEach(System.out::println);

        // sort in descending order means natural number order
        System.out.println("Numbers in descending order:");
        numbers.stream()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);
    }


}