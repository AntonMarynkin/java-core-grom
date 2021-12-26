package lesson17.hw;

public class Solution {

    public static void main(String[] args) {
        String words = "  Hello my dear friend,    let`s go fun ";
        System.out.println(countWords(words));
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

        String[] words = input.split(" ");

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            }
            return words[i];
        }
        return null;
    }

    public static String minWord(String input) {
        return null;
    }
}
