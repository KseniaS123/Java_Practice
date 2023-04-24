// 2. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

package lesson4.Homework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class HomeworkTaskTwo {
    public static void main(String[] args) {
        reverseList();
    }

    private static String reverseList() {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
        return sb.toString();
    }
}
