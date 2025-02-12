/*
5.	Найти первый четный элемент в списке [1, 2, 3, 4, 5],
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvenElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresent(System.out::println);
    }
}
