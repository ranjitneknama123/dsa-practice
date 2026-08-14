package stream;

import java.util.List;

public class MapStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Multiply by 2 in each existing number and print the result
        System.out.println("Numbers multiplied by 2:");
        numbers.stream()
                .map(e -> e * 2)
                .forEach(System.out::println);

        // Print only the number which is more that 2
        System.out.println("Numbers greater than 2:");
        numbers.stream()
                .filter(e -> e > 2)
                .forEach(System.out::println);
    }
}
