package main;

public class StoogeSort implements Sorter {
    public int[] sort(int[] array){
        stoogeSort(array, 0, array.length-1);
        return array;
    }

    public static void stoogeSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        if (array[start] > array[end]) {
            swap(array, start, end);
        }
        if (end - start + 1 >= 3) {
            int third = (int)Math.ceil((double)((end - start + 1) / 3));
            // recursively sort first 2/3, last 2/3, first 2/3
            stoogeSort(array, start, end - third);
            stoogeSort(array, start + third, end);
            stoogeSort(array, start, end - third);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
