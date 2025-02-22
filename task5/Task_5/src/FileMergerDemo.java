/*
3.	Используя решение 1 и 2, напишите метод,
который склеивает два текстовых файла один.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileMergerDemo {
    public static void mergeFiles(String file1, String file2, String outputFile) throws IOException {
        System.out.println("Проверяем файлы:");
        System.out.println("file1: " + file1 + " - " + Files.exists(Path.of(file1)));
        System.out.println("file2: " + file2 + " - " + Files.exists(Path.of(file2)));

        if (!Files.exists(Path.of(file1))) {
            throw new IOException("Файл не найден: " + file1);
        }
        if (!Files.exists(Path.of(file2))) {
            throw new IOException("Файл не найден: " + file2);
        }

        List<String> content1 = Files.readAllLines(Path.of(file1));
        List<String> content2 = Files.readAllLines(Path.of(file2));

        Files.write(Path.of(outputFile), content1, java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.TRUNCATE_EXISTING);
        Files.write(Path.of(outputFile), content2, java.nio.file.StandardOpenOption.APPEND);
    }

    public static void main(String[] args) {
        String file1 = "test.txt";
        String file2 = "output.txt";
        String outputFile = "merged.txt";

        try {
            mergeFiles(file1, file2, outputFile);
            System.out.println("Файлы успешно объединены в " + outputFile);
        } catch (IOException e) {
            System.err.println("Ошибка при объединении файлов: " + e.getMessage());
        }
    }
}