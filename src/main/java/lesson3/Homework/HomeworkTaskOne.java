// 1. Пусть дан произвольный список целых чисел,
// удалить из него четные числа (в языке уже есть что-то готовое для этого)

package lesson3.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class HomeworkTaskOne {
    public static void main(String[] args) {
        deleteEvenNums();
    }

    private static void deleteEvenNums() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
