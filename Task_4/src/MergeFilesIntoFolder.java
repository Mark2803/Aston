import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class File {
    String name;
    String extension;
    String directory;

    public File(String name, String extension, String directory) {
        this.name = name;
        this.extension = extension;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "File{name='" + name + "', extension='" + extension + "', directory='" + directory + "'}";
    }
}

public class MergeFilesIntoFolder {
    public static void main(String[] args) {
        // Создаем список файлов
        List<File> files = Arrays.asList(
                new File("document", "txt", "Docs"),
                new File("spreadsheet", "xls", "Reports"),
                new File("presentation", "ppt", "Presentations"),
                new File("notes", "txt", "Docs"),
                new File("summary", "pdf", "Reports")
        );

        // Объединяем файлы в одну папку и собираем уникальные расширения
        String targetDirectory = "MergedFolder";
        String mergedExtensions = files.stream()
                .map(file -> file.extension) // Берем только расширения
                .distinct() // Убираем дубликаты
                .collect(Collectors.joining(", ")); // Собираем в строку

        // Вывод результата
        System.out.println("Файлы собраны в папку: " + targetDirectory);
        System.out.println("Расширения файлов: " + mergedExtensions);
    }
}
