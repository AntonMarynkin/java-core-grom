package lesson5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 21, 1, 5, 8, 13, 34, 2};
        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int[] sortAscending(int[] arr) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];    //переставляем числа местами.
                    arr[i + 1] = buf;
                }
            }
        }

        //Или так
        //Arrays.sort(arr);

        return arr;
    }

    public static int[] sortDescending(int[] arr) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return arr;
    }
}
