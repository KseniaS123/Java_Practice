//2. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package lesson1.Homework;

public class HomeworkTaskTwo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        transArr(arr, 3);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    private static void transArr(int[] arr, int val) {
        int i, j;
        j = 0;
        for (i = 0; i < arr.length; i++)
            if (arr[i] != val) arr[j++] = arr[i];
        for (i = j; i < arr.length; i++) arr[i] = val;
    }
}
