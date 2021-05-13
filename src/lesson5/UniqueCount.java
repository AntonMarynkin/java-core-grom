package lesson5;

public class UniqueCount {
    public static void main(String[] args) {
        int[] ar = {10, 5, 11, 69, 10, 1, 108, 11, 9, 2, 11, 3};
        System.out.println(uniqueCount(ar));
    }

    public static int uniqueCount(int[] array) {
        int count = 1;
        for (int index = 1; index < array.length; index++) {
            if (index == findDuplicateIndex(array, index))
                count++;
        }
        return count;

        //вариант с инета
        /*int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;*/
    }

    public static int findDuplicateIndex(int[] array, int startIndex) {
        int index = 0;
        for (index = 0; index < startIndex; index++) {
            if (array[startIndex] == array[index])
                break;
        }
        return index;
    }
}
