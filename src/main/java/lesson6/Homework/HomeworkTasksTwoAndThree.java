// 2. Создать множество ноутбуков (ArrayList).
// 3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию.

package lesson6.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkTasksTwoAndThree {
    public static void main(String[] args) {
        LapTop lp1 = new LapTop(
                1,
                "Apple",
                "AppleM1",
                16,
                "AppleGraphics8-core",
                "Grey",
                "USA");
        LapTop lp2 = new LapTop(
                2,
                "Asus",
                "IntelCorei5",
                16,
                "NVIDIA",
                "DarkGrey",
                "China");
        LapTop lp3 = new LapTop(
                3,
                "Acer",
                "AMDRyzen",
                8,
                "AMDRadeon",
                "Black",
                "China");
        LapTop lp4 = new LapTop(
                4,
                "Redmi",
                "IntelCorei7",
                16,
                "NVIDIA",
                "Grey",
                "China");
        LapTop lp5 = new LapTop(
                5,
                "Honor",
                "IntelCorei5",
                8,
                "Intel",
                "Black",
                "China");
        LapTop lp6 = new LapTop(
                6,
                "Acer",
                "AMDAthlon",
                4,
                "AMDRadeon",
                "Black",
                "China");

        List<LapTop> lapTops = new ArrayList<>();
        lapTops.add(lp1);
        lapTops.add(lp2);
        lapTops.add(lp3);
        lapTops.add(lp4);
        lapTops.add(lp5);
        lapTops.add(lp6);
        lapTops.forEach(value -> System.out.println(value));
        sortByModel(lapTops);
        sortByColor(lapTops);
        sortByRam(lapTops);
    }

    private static void sortByRam(List<LapTop> lapTops) {
        List<LapTop> sortLapTops = new ArrayList<>();
        System.out.printf("Укажите минимальный объем оперативной памяти: ");
        Scanner in = new Scanner(System.in);
        Integer num = Integer.valueOf(in.nextLine());

        for (LapTop lapTop : lapTops) {
            try {
                if(Integer.parseInt(String.valueOf(lapTop.getRam())) >= num)
                    sortLapTops.add(lapTop);
            }
            catch (NumberFormatException ignored) {

            }
        }
        sortLapTops.forEach(value -> System.out.println(value));
    }

    private static void sortByColor(List<LapTop> lapTops) {
        List<LapTop> sortLapTops = new ArrayList<>();
        System.out.printf("Введите цвет: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        for (LapTop lapTop : lapTops) {
            if (lapTop.getColor().equalsIgnoreCase(text)) {
                sortLapTops.add(lapTop);
            }
        }
        sortLapTops.forEach(value -> System.out.println(value));
    }

    public static void sortByModel(List<LapTop> lapTops)  {
        List<LapTop> sortLapTops = new ArrayList<>();
        System.out.printf("Введите название модели: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        for (LapTop lapTop : lapTops) {
            if (lapTop.getModel().equalsIgnoreCase(text)) {
                sortLapTops.add(lapTop);
            }
        }
        sortLapTops.forEach(value -> System.out.println(value));
    }
}
