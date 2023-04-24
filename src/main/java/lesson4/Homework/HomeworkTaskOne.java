// 1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

package lesson4.Homework;

import java.util.*;

public class HomeworkTaskOne {
    public static void main(String[] args) {
        workWithList();
    }

    private static void workWithList() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.printf("Введите строку: ");
            String text = in.nextLine();
            int last = 0;

            if (text.equals(" ")) {
                break;
            }
            if (text.equals("print")) {
                Collections.swap((List<?>) list, 0, list.size() - 1);
            } else if (text.equals("revert")) {
                list.remove(last);
            } else {
                last = list.size();
                list.add(text);
            }
            System.out.println(list);
        }
    }
}
