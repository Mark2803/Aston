/*
10.	Выведите все нечетные числа в заданном массиве.
 */


import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintOddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод диапазона
        System.out.print("Введите начало диапазона: ");
        int from = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int to = scanner.nextInt();

        // Выводим нечетные числа в заданном диапазоне
        IntStream.range(from, to + 1) // создаём поток от from до to
                .filter(n -> n % 2 != 0) // фильтруем нечетные числа
                .forEach(System.out::println); // выводим результат
    }
}
