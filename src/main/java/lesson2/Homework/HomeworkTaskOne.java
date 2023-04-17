// 1. Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).

package lesson2.Homework;

import java.util.Scanner;

public class HomeworkTaskOne {
    public static void main(String[] args) {
        isPalindrome();
    }

    public static boolean isPalindrome() {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0; i < (string.length() / 2); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
