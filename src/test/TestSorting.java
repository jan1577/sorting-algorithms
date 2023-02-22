package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import classes
import main.BubbleSort;
import main.InsertionSort;
import main.SelectionSort;
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
    }

    @Test
    public void testSortedArray() {
        int[] testArray = new int[]{1,2,3,4,5}, expected = new int[]{1,2,3,4,5};
        // BubbleSort
        assertArrayEquals(expected, BubbleSort.sort(new int[] {1,2,3,4,5}));
        // InsertionSort
        assertArrayEquals(expected, InsertionSort.sort(new int[] {1,2,3,4,5}));
        // SelectionSort
        assertArrayEquals(expected, SelectionSort.sort(new int[] {1,2,3,4,5}));

    }
    @Test
    public void testWithNegativeNumbers() {
        int[] testArray = new int[] {2,3,-5,-1,4,9};
        int[] expected = new int[]{-5, -1, 2, 3, 4, 9};

        //BubbleSort
        assertArrayEquals(expected, BubbleSort.sort(testArray));
        // InsertionSort
        assertArrayEquals(expected, InsertionSort.sort(testArray));
        // SelectionSort
        assertArrayEquals(expected, SelectionSort.sort(testArray));

    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = new int[] {};

        //BubbleSort
        assertArrayEquals(emptyArray, BubbleSort.sort(emptyArray));
        // InsertionSort
        assertArrayEquals(emptyArray, InsertionSort.sort(emptyArray));
        // SelectionSort
        assertArrayEquals(emptyArray, SelectionSort.sort(emptyArray));

    }
}
