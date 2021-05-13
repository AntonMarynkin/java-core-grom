package lesson5;

import java.util.Arrays;

public class UniqueCount2 {
    public static void main(String[] args) {
        int[] ar = {10, 5, 11, 69, 10, 1, 108, 11, 9, 2, 11, 3};
        System.out.println(uniqueCount(ar));
        System.out.println(Arrays.toString(sortArray(ar)));
    }

    public static int uniqueCount(int[] array) {
        int uniCount = 1;
        sortArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1])
                uniCount++;
        }
        return uniCount;
    }

    //вариант с сортировкой
    public static int[] sortArray(int[] array) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
}
