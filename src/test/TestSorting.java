package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import main.Sorter;
import main.BubbleSort;
import main.InsertionSort;
import main.SelectionSort;
import main.RadixSort;
import main.QuickSort;
import main.StoogeSort;

public class TestSorting {
    @Test
    public void testBubbleSort() {
        testAlgorithm(new BubbleSort(), true);
    }

    @Test
    public void testInsertionSort() {
        testAlgorithm(new InsertionSort(), true);
    }

    @Test
    public void testSelectionSort() {
        testAlgorithm(new SelectionSort(), true);
    }

    @Test
    public void testRadixSort() {
        testAlgorithm(new RadixSort(), false);
    }

    @Test
    public void testQuickSort() {
        testAlgorithm(new QuickSort(), true);
    }

    @Test
    public void testStoogeSort() {
        testAlgorithm(new StoogeSort(), true);
    }

    private void testAlgorithm(Sorter sorter, boolean negativeNumbers) {
        // test array of length 1
        testSort(sorter, new int[]{1}, new int[]{1});
        // test sorted array
        testSort(sorter, new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
        // test array with positive numbers
        testSort(sorter, new int[]{2, 338, 3, 199, 1010, 69, 4, 9, 33}, new int[]{2, 3, 4, 9, 33, 69, 199, 338, 1010});
        // test array with negative numbers
        if (negativeNumbers) {
            testSort(sorter, new int[]{2, 3, -5, -1, 4, 9}, new int[]{-5, -1, 2, 3, 4, 9});
        }
        // test empty array
        testSort(sorter, new int[]{}, new int[]{});
    }

    private void testSort(Sorter sorter, int[] input, int[] expected) {
        assertArrayEquals(expected, sorter.sort(input));
    }
}
