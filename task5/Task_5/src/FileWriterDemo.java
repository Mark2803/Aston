/*
2.	Написать метод, который записывает
в файл строку, переданную параметром.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriterDemo {
    public static void writeFile(String filePath, String content) throws IOException {
        Files.writeString(Path.of(filePath), content + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public static void main(String[] args) {
        String filePath = "output.txt"; // Укажите путь к файлу
        String content = "Привет, мир! Это тестовая запись.";

        try {
            writeFile(filePath, content);
            System.out.println("Строка успешно записана в файл!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
