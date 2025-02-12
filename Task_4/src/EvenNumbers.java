/*
1.	Вывести все четные числа в диапазоне от 1 до 100,
*/

import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
