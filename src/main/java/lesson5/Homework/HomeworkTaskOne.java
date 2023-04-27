// 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package lesson5.Homework;

import java.util.*;
import java.util.List;

public class HomeworkTaskOne {
    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        Map<String, String> pb = new HashMap<>();
        List<String> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String name = null;
        while (true) {
            System.out.printf("Введите ФИО: ");
            String currentName = in.nextLine();

            if(currentName.equals(name)) {
                name = currentName;
                System.out.printf("Введите телефон(-ы через пробел): ");
                String phone = in.nextLine();
                values.add(phone);
                pb.put(currentName, values.toString().replaceAll("^\\[|\\]$", ""));
                if (currentName.equals(" ") || phone.equals(" ")) {
                    break;
                }
            } else {
                name = currentName;
                values.clear();
                System.out.printf("Введите телефон(-ы через пробел): ");
                String phone = in.nextLine();
                values.add(phone);
                pb.put(currentName, values.toString().replaceAll("^\\[|\\]$", ""));
                if (currentName.equals(" ") || phone.equals(" ")) {
                    break;
                }
            }
        }

        for (Map.Entry<String, String> entry: pb.entrySet()) {
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }
    }
}
