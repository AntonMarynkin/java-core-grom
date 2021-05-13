package lesson4;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        int sum1 = 0;
        for (int i = a; i <= b; i++) {
            sum1 += i;
        }

        int sum2 = 0;
        for (int i = c; i <= d; i++) {
            sum2 += i;
        }
        return sum1 > sum2 ? true : false;
    }

    public static int sum (int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
