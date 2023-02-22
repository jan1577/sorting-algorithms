package main;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[]array){

        boolean isSorted = false;
        int iterations = 0;

        while(!isSorted){
            isSorted = true;

            for (int i=0; i < array.length - 1 - iterations; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swapNumbers(array, i, i + 1);
                }
                System.out.println(Arrays.toString(array));
            }
            iterations += 1;
        }
        return array;
    }

    public static void swapNumbers(int[] array, int i, int j){
        int helper = array[i];
        array[i] = array[j];
        array[j] = helper;
    }
}
