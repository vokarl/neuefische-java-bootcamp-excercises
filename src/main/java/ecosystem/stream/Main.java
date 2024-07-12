package ecosystem.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(number -> number %  2 == 0)
                .forEach(System.out::println);

        System.out.println("doubled numbers:");

        numbers.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);

        System.out.println("sort ascending:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("sort descending:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("reduce to sum:");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);        //mit 0 wird initialisiert
        System.out.println("\nSum of Numbers: " + sum);

        System.out.println("collect to new list:");
        List<Integer> processedNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nProcessed Numbers List: " + processedNumbers);
    }

}
