package lesson8.homework;

public class Adder extends Arithmetic {
    public static void main(String[] args) {
        System.out.println(add(3, 6));
    }

    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
}
