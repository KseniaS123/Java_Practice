// 4*. Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
package lesson3.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkTaskFour {
    public static void main(String[] args) {
        removeInt();
    }

    private static void removeInt() {
        String[] values = {"a", "b", "c", "d", "e", "1", "2", "3", "4"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(values[random.nextInt(9)]);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (NumberFormatException ignored) {

            }
        }
        System.out.println(list);
    }
}
