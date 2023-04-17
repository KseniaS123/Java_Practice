// 3*.Напишите метод, который определит тип (расширение) файлов из текущей папки
// и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg

package lesson2.Homework;

import java.io.File;
import java.util.Arrays;

public class HomeworkTaskThree {
    public static void main(String[] args) {

        fileExtensionFromDirectory("D:\\Гикбрейнс");
    }

    private static String fileExtensionFromDirectory(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return pathDir;
        }

        String[] dirListNames = file.list();
        System.out.println(Arrays.toString(dirListNames));

        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) {
            sb.append(fileName).append("\n");
        }
        System.out.println(sb);

//            int index = sb.indexOf(".");
        return pathDir;
    }
}
