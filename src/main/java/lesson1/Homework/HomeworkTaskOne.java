//1. Задать одномерный массив и найти
//в нем минимальный и максимальный элементы.

package lesson1.Homework;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTaskOne {
    public static void main(String[] args) {
        arrRandomMinMax(10);
    }

    private static void arrRandomMinMax(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.printf(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Максимальное: %s%n ", max);
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.printf("Минимальное: %s%n ", min);
    }
}
