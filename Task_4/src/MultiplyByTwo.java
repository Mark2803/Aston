/*
2.	Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2,
 */

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class MultiplyByTwo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
