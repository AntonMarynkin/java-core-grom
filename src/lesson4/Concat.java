package lesson4;

public class Concat {

    public static void main(String[] args) {
        System.out.println(concat("Hello", "My", "Friend"));
    }

    public static String concat (String first, String second, String third) {
        return first + second + third;
    }

}
