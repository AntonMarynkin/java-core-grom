package lesson17.hw;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String string = "  Hello my dear friend    let`s go fun ";
        System.out.println(countWords(string));
        System.out.println(maxWord(string));
        System.out.println(minWord(string));
    }

    public static int countWords(String input) {
        int count = 0;

        char[] chars = input.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && chars[i + 1] != ' ')
                count++;
        }
        return count + 1;
    }

    public static String maxWord(String input) {

        String[] words = input.trim().split(" ");
        System.out.println(Arrays.toString(words));

        int count;
        int maxCount = 0;
        String word = new String();

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            count = chars.length;
            //System.out.println(maxCount);
            if (count > maxCount) {
                maxCount = count;
                word = words[i];
            }
        }
        return word;
    }

    public static String minWord(String input) {

        String[] words = input.trim().split(" ");

        int count;
        int minCount = Integer.MAX_VALUE;
        String word = new String();

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            count = chars.length;
            //System.out.println(minCount);
            if (count != 0 && count < minCount) {
                minCount = count;
                word = words[i];
            }
        }
        return word;
    }
}
