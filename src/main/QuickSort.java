package main;

public class QuickSort {
    public static int[] sort(int[] array){
        quickSort(array, 0, array.length -1);
        return array;
    }

    public static void quickSort(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        int leftStart = left + 1;
        int rightStart = right;
        int pivot = left;

        while (left <= right){
            if (array[left] > array[pivot] && array[right] < array[pivot]){
                swapNumbers(array, left, right);
            }
            if (array[left] <= array[pivot]){
                left += 1;
            }
            if (array[right] >= array[pivot]){
                right -= 1;
            }
        }
        swapNumbers(array, pivot, right);
        quickSort(array, leftStart - 1, right-1);
        quickSort(array, left, rightStart);
    }

    public static void swapNumbers(int[] array, int left, int right) {
        int first = array[left];
        array[left] = array[right];
        array[right] = first;
    }
}
