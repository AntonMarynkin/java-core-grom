package lesson3;

public class IfElseExample {
    public static void main(String[] args) {
        int test = 1000;

        if (test > 100) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        // if(condition1 - logical operator - conditional2 ....) {
        // if-body
        // }
        // else {
        // else-body
        // }


        /* if (test > 100)
            System.out.println("Good");
        else
            System.out.println("Bad"); */


        int test1 = 1000;
        boolean result = false;

        if (test1 > 1000) {
            result = true;
        }

        if (result)
            System.out.println("Nice");
        else
            System.out.println("Not nice");

        if (result && test1 > 100 || test1 > 500) {
            System.out.println("!");
        }
        else {
            System.out.println("?");
        }

        if (!(test1 > 0)) {
            System.out.println("!!!!");
        }
    }
}
