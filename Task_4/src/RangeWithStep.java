/*
4.	Вывести числа в диапазоне от 1 до 50 с шагом 2,
 */
import java.util.stream.IntStream;

public class RangeWithStep {
    public static void main(String[] args) {
        IntStream.iterate(1, n -> n + 2)
                .limit(25)
                .forEach(System.out::println);
    }
}
