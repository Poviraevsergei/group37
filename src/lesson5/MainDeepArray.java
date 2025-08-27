package lesson5;

import java.util.Arrays;

public class MainDeepArray {
    public static void main(String[] args) {
        int[][] numArray = {
                {1, 2, 3, 4, 5},
                {6, 7},
                {8, 9, 0}
        };

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print(numArray[i][j] + " ");
            }
            System.out.println();
        }

        int[][] deepArray = new int[5][];
        deepArray[0] = new int[10];
        deepArray[1] = new int[2];
        deepArray[2] = new int[7];
        deepArray[3] = new int[1];
        deepArray[4] = new int[14];

        //Arrays
        System.out.println(Arrays.deepEquals(numArray, deepArray));
        System.out.println(Arrays.deepToString(numArray));
    }
}
