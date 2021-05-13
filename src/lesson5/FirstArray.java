package lesson5;

import java.sql.Array;
import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        int a;       //declaration
        a = 10;      //initialization

        //type of array [] name of array = new type of array [length of array];
        int [] firstArray = new int[3];          //declaration

        System.out.println(Arrays.toString(firstArray));    // 0, 0, 0

        //array name [index] - get array element
        firstArray[0] = 11;                     //initialization
        firstArray[1] = 200;
        firstArray[2] = -10;

        /*for (int i = 0; i < 3; i++) {
            System.out.println(firstArray[i]);*/

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        System.out.println(firstArray);
        System.out.println(Arrays.toString(firstArray));


        int [] secondArray = {1, 10, 15, 20, -52};
        System.out.println(Arrays.toString(secondArray));

        //for-each
        for (int element : secondArray) {
            System.out.println(element);
        }

        // детальнее
        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.println(element);
        }

    }
}
