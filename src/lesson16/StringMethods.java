package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String test = "someStringExample";

        System.out.println(test.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(test.length());
        System.out.println(test.charAt(2));
        System.out.println(test.replace("me", "T"));
        //оригинал test остается без изменений!
        System.out.println(test.replaceAll("me", "T"));

        //когда в стринге нет символа который нужно заменить (ничего не происходит)
        System.out.println(test.replace("mes", "T"));

        System.out.println(test);
        System.out.println(test.contains("mes"));

        System.out.println(Arrays.toString(test.split("e")));
        System.out.println(" уберает пробелы в начале и конце ".trim());
        System.out.println(test.substring(3, 10));
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        test.getBytes();
        test.equals("eeee");
        test.intern();
    }
}
