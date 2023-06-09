// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package lesson2.Homework;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HomeworkTaskTwo {
    static StringBuilder sb = new StringBuilder("TEST");

    public static void main(String[] args) throws IOException {
        stringTest();
        writeFile();
    }

    public static StringBuilder stringTest() {

        for (int i = 0; i < 99; i++) {
            sb.append("TEST");
        }
        return sb;
    }
    public static void writeFile() throws IOException {
        Path path = Paths.get("src/main/test.txt");
        String contents = sb.toString();

        try {
            Files.writeString(path, contents, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

