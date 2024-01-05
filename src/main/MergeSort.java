package main;

import java.util.Arrays;

public class MergeSort implements Sorter{
    public int[] sort(int[] array){
        return mergeSort(array);
    }

    public int[] mergeSort(int[] array) {
        if (array.length <= 1){
            return array;
        }

        int r = array.length;
        int m = r/2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, m));
        int[] right = mergeSort(Arrays.copyOfRange(array, m, r));

        return merge (left, right);
    }

    public int[] merge(int[] array1, int[] array2){
        int[] output = new int[array1.length + array2.length];
        int i=0, j=0, k=0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                output[k] = array1[i];
                i ++;
            } else {
                output[k] = array2[j];
                j ++;
            }
            k++;
        }

        while (i < array1.length) {
            output[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            output[k] = array2[j];
            j++;
            k++;
        }

        return output;
    }
}
