package test;

import main.InsertionSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.BubbleSort;
public class TestSorting {

    @Test
    public void testArrayOfLengthOne() {
        // BubbleSort
        assertArrayEquals(new int[]{1}, BubbleSort.sort(new int[]{1}));
        // InsertionSort
        assertArrayEquals(new int[]{1}, InsertionSort.sort(new int[]{1}));
    }

    @Test
    public void testSortedArray() {
        // BubbleSort
        assertArrayEquals(new int[]{1,2,3,4,5}, BubbleSort.sort(new int[] {1,2,3,4,5}));
        // InsertionSort
        assertArrayEquals(new int[]{1,2,3,4,5}, InsertionSort.sort(new int[] {1,2,3,4,5}));
    }
    @Test
    public void testWithNegativeNumbers() {
        //BubbleSort
        assertArrayEquals(new int[]{-5, -1, 2, 3, 4, 9}, BubbleSort.sort(new int[] {2,3,-5,-1,4,9}));
        // InsertionSort
        assertArrayEquals(new int[]{1,2,3,4,5}, InsertionSort.sort(new int[] {1,2,3,4,5}));
    }
}
