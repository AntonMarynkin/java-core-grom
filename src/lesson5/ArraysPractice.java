package lesson5;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = {-10, 0, 110, 556, 10, 1000, -109, 10};
        System.out.println(maxElement(array));
        System.out.println(nCount(array, 10));
    }


    public static int maxElement(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }


    public static int nCount(int[] array, int n) {
        int count = 0;
        for (int el : array) {
            if (el == n)
                count++;
        }
        return count;
    }

}
