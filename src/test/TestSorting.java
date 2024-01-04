package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import main.BubbleSort;
import main.InsertionSort;
import main.SelectionSort;
import main.RadixSort;
import main.QuickSort;
import main.StoogeSort;

public class TestSorting {

    @Test
    public void testArrayOfLengthOne() {
        int[] testArray = new int[]{1}, expected = new int[]{1};
        // BubbleSort
        assertArrayEquals(expected, BubbleSort.sort(testArray));
        // InsertionSort
        assertArrayEquals(expected, InsertionSort.sort(testArray));
        // SelectionSort.java
        assertArrayEquals(expected, SelectionSort.sort(testArray));
        //RadixSort
        assertArrayEquals(expected, RadixSort.sort(testArray));
        //QuickSort
        assertArrayEquals(expected, QuickSort.sort(testArray));
        //StoogeSort
        assertArrayEquals(expected, StoogeSort.sort(testArray));
    }

    @Test
    public void testSortedArray() {
        int[] sortedArray = new int[]{1, 2, 3, 4, 5};
        // BubbleSort
        assertArrayEquals(sortedArray, BubbleSort.sort(sortedArray));
        // InsertionSort
        assertArrayEquals(sortedArray, InsertionSort.sort(sortedArray));
        // SelectionSort
        assertArrayEquals(sortedArray, SelectionSort.sort(sortedArray));
        //RadixSort
        assertArrayEquals(sortedArray, RadixSort.sort(sortedArray));
        //QuickSort
        assertArrayEquals(sortedArray, QuickSort.sort(sortedArray));
        //StoogeSort
        assertArrayEquals(sortedArray, StoogeSort.sort(sortedArray));
    }

    @Test
    public void testOnlyPositiveNumbers() {
        int[] testArray = new int[]{2, 338, 3, 199, 1010, 69, 4, 9, 33};
        int[] expected = new int[]{2, 3, 4, 9, 33, 69, 199, 338, 1010};

        //BubbleSort
        assertArrayEquals(expected, BubbleSort.sort(testArray));
        // InsertionSort
        assertArrayEquals(expected, InsertionSort.sort(testArray));
        // SelectionSort
        assertArrayEquals(expected, SelectionSort.sort(testArray));
        // RadixSort
        assertArrayEquals(expected, SelectionSort.sort(testArray));
        // QuickSort
        assertArrayEquals(expected, QuickSort.sort(testArray));
        //StoogeSort
        assertArrayEquals(expected, StoogeSort.sort(testArray));
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] testArray = new int[]{2, 3, -5, -1, 4, 9};
        int[] expected = new int[]{-5, -1, 2, 3, 4, 9};

        //BubbleSort
        assertArrayEquals(expected, BubbleSort.sort(testArray));
        // InsertionSort
        assertArrayEquals(expected, InsertionSort.sort(testArray));
        // SelectionSort
        assertArrayEquals(expected, SelectionSort.sort(testArray));
        // RadixSort - only works for positive numbers as implemented
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                RadixSort.sort(testArray), "IndexOutOfBoundsException");
        //QuickSort
        assertArrayEquals(expected, QuickSort.sort(testArray));
        //StoogeSort
        assertArrayEquals(expected, StoogeSort.sort(testArray));
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = new int[]{};

        //BubbleSort
        assertArrayEquals(emptyArray, BubbleSort.sort(emptyArray));
        // InsertionSort
        assertArrayEquals(emptyArray, InsertionSort.sort(emptyArray));
        // SelectionSort
        assertArrayEquals(emptyArray, SelectionSort.sort(emptyArray));
        //RadixSort
        assertArrayEquals(emptyArray, RadixSort.sort(emptyArray));
        //QuickSort
        assertArrayEquals(emptyArray, QuickSort.sort(emptyArray));
        //StoogeSort
        assertArrayEquals(emptyArray, StoogeSort.sort(emptyArray));
    }
}
