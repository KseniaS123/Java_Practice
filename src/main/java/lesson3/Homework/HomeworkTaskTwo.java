// 2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

package lesson3.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeworkTaskTwo {
    public static void main(String[] args) {
        minMaxAverage();
    }

    private static void minMaxAverage() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        int max = list.get(0);
        int min = list.get(0);
        double sum = 0;
        double average;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        average = sum / list.size();
        System.out.printf("Max: %s%n", max);
        System.out.printf("Min: %s%n", min);
        System.out.printf("Average: %.1f", average);
    }
}
