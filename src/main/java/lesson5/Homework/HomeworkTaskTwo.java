// 2. Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package lesson5.Homework;

import java.util.*;

public class HomeworkTaskTwo {
    public static void main(String[] args) {
        sortNames();
    }

    private static void sortNames() {
        Map<String, String> employees = new HashMap<>();
        employees.put("Иванов", "Иван");
        employees.put("Петрова", "Светлана");
        employees.put("Белова", "Кристина");
        employees.put("Мусина", "Анна");
        employees.put("Крутова", "Анна");
        employees.put("Юрин", "Иван");
        employees.put("Лыков", "Петр");
        employees.put("Чернов", "Павел");
        employees.put("Чернышов", "Петр");
        employees.put("Федорова", "Мария");
        employees.put("Светлова", "Марина");
        employees.put("Савина", "Мария");
        employees.put("Рыкова", "Мария");
        employees.put("Лугова", "Марина");
        employees.put("Владимирова", "Анна");
        employees.put("Мечников", "Иван");
        employees.put("Петин", "Петр");
        employees.put("Ежов", "Иван");

        List<String> list = new ArrayList<>();
        Map<String, String> copy = new HashMap<>(employees);

        for (Map.Entry<String, String> pair1 : employees.entrySet()) {
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()))
                    list.add(pair1.getValue());
            }
        }

        Map<String, Integer> sort = new HashMap<>();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            }else if (count > 1){
                sort.put(list.get(i), count);
                count = 1;
            }
        }
        sort.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
