package main;

public class RadixSort implements Sorter {

    public int[] sort(int[] array) {
        // get max number of the array to get the max number of digits
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        int numOfDigits = String.valueOf(maxNumber).length();

        for (int digit = 0; digit < numOfDigits; digit++) {
            array = countSort(array, digit);
        }
        return array;
    }

    public static int[] countSort(int[] array, int digit) {
        int[] counts = new int[10];
        int[] sorted = new int[array.length];

        // for every number, get digit and increase counter in counts
        for (int i = 0; i < array.length; i++) {
            int num = getNthDigit(array[i], digit);
            counts[num] += 1;
        }
        // loop through counts to get indices where last number with certain digit can be placed
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        // loop through array backwards and place numbers in sorted array
        for (int i = array.length - 1; i >= 0; i--) {
            int num = getNthDigit(array[i], digit);
            // get last number from counts where number could be placed and update this index in sorted
            counts[num] -= 1;
            sorted[counts[num]] = array[i];
        }
        return sorted;
    }

    public static int getNthDigit(int number, int digit) {
        return number / (int) Math.pow(10, digit) % 10;
    }

}
