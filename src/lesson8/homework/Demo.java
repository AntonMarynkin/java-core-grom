package lesson8.homework;

public class Demo {
    public static void main(String[] args) {
        int[] array = {-10, 0, 110, 556, 10, 1000, -109, 10};
        Adder adder = new Adder();
        System.out.println(adder.add(3, 9));
        System.out.println(adder.check(array));
    }
}
