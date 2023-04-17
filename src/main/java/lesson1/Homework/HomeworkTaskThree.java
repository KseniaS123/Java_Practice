//3*. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package lesson1.Homework;

import java.time.LocalTime;
import java.util.Scanner;

import static javax.management.Query.in;

public class HomeworkTaskThree {
    public static void main(String[] args) {
        nameTimeWelcome();
    }

    private static void nameTimeWelcome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime morningStart = LocalTime.of(5, 00);
        LocalTime morningEnd = LocalTime.of(11, 59);
        LocalTime noonStart = LocalTime.of(12, 00);
        LocalTime noonEnd = LocalTime.of(17, 59);
        LocalTime eveningStart = LocalTime.of(18, 00);
        LocalTime eveningEnd = LocalTime.of(22, 59);
        LocalTime nightStart = LocalTime.of(23, 00);
        LocalTime nightEnd = LocalTime.of(4, 59);
        if (localTime.isAfter(morningStart) && localTime.isBefore(morningEnd)) {
            System.out.printf("Доброе утро, %s", name);
        }
        if (localTime.isAfter(noonStart) && localTime.isBefore(noonEnd)) {
            System.out.printf("Добрый день, %s", name);
        }
        if (localTime.isAfter(eveningStart) && localTime.isBefore(eveningEnd)) {
            System.out.printf("Добрый вечер, %s", name);
        }
        if (localTime.isAfter(nightStart) && localTime.isBefore(nightEnd)) {
            System.out.printf("Доброй ночи, %s", name);
        }
    }
}
