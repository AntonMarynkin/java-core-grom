package lesson4;

public class FindDiv {
    public static void main(String[] args) {
    }

    public static int findDivCount(short a, short b, int n) {
        int d = b;
        int count = 0;

        for (int c = a; c <= d; c++) {
            if (n > 0 && 0 <= c && c <= d && c % n == 0)
                count++;
        }
        return count;
    }
}
