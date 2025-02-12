/*
6.	Отсортировать элементы массива [1, 3, 5, 7, 9] по возрастанию,
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        String sortedNumbers = numbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(sortedNumbers);
    }
}