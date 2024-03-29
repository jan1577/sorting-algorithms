package main;
public class SelectionSort implements Sorter {
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int smallestNumber = array[i];
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallestNumber) {
                    smallestNumber = array[j];
                    smallestIndex = j;
                }
            }
            swapNumbers(array, i, smallestIndex);
        }
        return array;
    }

    public static void swapNumbers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
