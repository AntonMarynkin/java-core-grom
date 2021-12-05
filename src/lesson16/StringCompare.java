package lesson16;

import java.util.Arrays;

public class StringCompare {
    public static void main(String[] args) {
        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc").equals(new String("abc")));
        System.out.println("abc" == "abc");
        System.out.println("abc".equals("abc"));

        String s1 = "test";
        String s2 = "test";
        System.out.println(s1 == s2);

        //using intern добавляет объект в String Pool
        String s3 = "pppp";
        String s4 = new String("pppp");
        System.out.println(s3 == s4);
        s4 = s4.intern();
        System.out.println(s3 == s4);

        //bytes of String
        String str = "testStringVar";
        System.out.println(Arrays.toString(str.getBytes()));
        //обратно в String
        System.out.println(new String(str.getBytes()));
    }
}
