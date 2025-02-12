/*
Выведите на экран только те элементы списка, которые больше заданного числа.
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Scanner;

public class PrintNumbersGreaterThanGivenFrom100 {
    public static void main(String[] args) {
        // Создаем список чисел от 1 до 100
        List<Integer> numbers = IntStream.range(1, 101) // от 1 до 100
                .boxed() // преобразуем в Integer
                .collect(Collectors.toList());

        // Ввод заданного числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int threshold = scanner.nextInt();

        // Выводим числа больше заданного
        numbers.stream()  // создаем поток из списка
                .filter(n -> n > threshold) // фильтруем числа больше заданного
                .forEach(System.out::println); // выводим результат
    }
}
