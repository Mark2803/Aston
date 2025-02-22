/*
4.	Написать метод который заменяет
в файле все кроме букв и цифр на знак ‘$’
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileSanitizerDemo {
    public static void sanitizeFile(String filePath) throws IOException {
        Path path = Path.of(filePath);

        if (!Files.exists(path)) {
            throw new IOException("Файл не найден: " + filePath);
        }

        List<String> lines = Files.readAllLines(path);

        // Обрабатываем построчно, заменяя только ненужные символы
        List<String> sanitizedLines = lines.stream()
                .map(line -> line.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$") // Исправленное экранирование
                        .replaceAll("\\$+", "\\$")) // Убираем повторяющиеся $
                .collect(Collectors.toList());

        Files.write(path, sanitizedLines);
    }

    public static void main(String[] args) {
        String filePath = "merged.txt"; // Файл, который будем очищать

        try {
            sanitizeFile(filePath);
            System.out.println("Файл успешно очищен от спецсимволов: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}
