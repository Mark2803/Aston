/*
1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderDemo {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public static void main(String[] args) {
        String filePath = "test.txt"; // Укажите путь к файлу

        try {
            List<String> lines = readFile(filePath);

            // Выводим содержимое файла в консоль
            System.out.println("Содержимое файла:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
