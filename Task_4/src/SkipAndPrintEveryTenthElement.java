/* 8.	Пропустить первые 10 элементов списка [0, 1, 2,.., 99]
    и начать выводить с 11-го элемента, выводя каждый 10-й элемент
*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SkipAndPrintEveryTenthElement {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 100) // создаём поток от 0 до 99
                .skip(10)      // пропускаем первые 10 элементов
                .filter(n -> n % 10 == 0) // выбираем каждый 10-й элемент
                .boxed()       // превращаем элементы в объекты Integer
                .collect(Collectors.toList()); // собираем их в список

        numbers.forEach(System.out::println); // выводим результат
    }
}
