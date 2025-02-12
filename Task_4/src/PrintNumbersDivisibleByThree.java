/*
9.	Выведите на экран все числа в диапазоне от 1 до 100, которые делятся на 3.
 */

import java.util.stream.IntStream;

public class PrintNumbersDivisibleByThree {
    public static void main(String[] args) {
        IntStream.range(1, 101) // создаём поток от 1 до 100
                .filter(n -> n % 3 == 0) // оставляем только числа, делящиеся на 3
                .forEach(System.out::println); // выводим результат
    }
}
