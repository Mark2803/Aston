/*
3.	Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()
 */
import java.util.stream.IntStream;

public class SumUsingReduce {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
