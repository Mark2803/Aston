/*
7.	Вывести первые 10 чисел в списке [0, 1, 2, … 99]
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class FirstTenNumbers {
    public static void main(String[] args) {
        List<Integer> firstTenNumbers = IntStream.range(0, 100)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(firstTenNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
