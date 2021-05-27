package lesson8.homework;

import java.util.Arrays;

public class Arithmetic {

    public static void main(String[] args) {
        int[] array = {-10, 0, 110, 556, 10, 1000, -109, 10};
        System.out.println(check(array));
    }

    public static boolean check(int[] array) {

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
        int count = 0;
        for (int el = 0; el < array.length; el++) {
            count++;
        }
        if (array[0] + array[count - 1] > 100)
            return true;
        return false;
    }
}
