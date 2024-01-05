package main;

public class InsertionSort implements Sorter {

    public int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int j = i - 1;

            while (j >= 0 && array[j + 1] < array[j]) {
                swapNumbers(array, j, j + 1);
                j -= 1;
            }
        }

        return array;
    }

    public static void swapNumbers(int[] array, int i, int j) {

        int helper = array[i];
        array[i] = array[j];
        array[j] = helper;

    }

}
