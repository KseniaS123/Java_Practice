package lesson1;

import java.util.Scanner;

public class MainClassLessonOne {
    public static void main(String[] args) {
        exOne();
    }

    private static void exOne() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Привет, %s", name);
        scanner.close();
    }
}
