/*
Создание трех Stream из массивов и объединение их в один.
Затем вывод на экран среднего геометрического значения элементов этого Stream.
 */

import java.util.stream.Stream;

public class MergeStreamsAndCalculateGeometricMean {
    public static void main(String[] args) {
        // Исходные массивы
        Integer[] array1 = {2, 4, 8};
        Integer[] array2 = {16, 32, 64};
        Integer[] array3 = {128, 256, 512};

        // Объединяем три потока в один
        double geometricMean = Stream.of(array1, array2, array3) // создаем поток массивов
                .flatMap(Stream::of) // объединяем в один поток элементов
                .mapToDouble(n -> n) // преобразуем в поток double
                .reduce(1, (a, b) -> a * b); // перемножаем все элементы

        // Вычисляем среднее геометрическое
        geometricMean = Math.pow(geometricMean, 1.0 / (array1.length + array2.length + array3.length));

        // Вывод результата
        System.out.println("Среднее геометрическое: " + geometricMean);
    }
}
