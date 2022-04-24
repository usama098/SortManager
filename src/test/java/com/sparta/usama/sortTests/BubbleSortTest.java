package com.sparta.usama.sortTests;


import com.sparta.usama.parent.ParentTest;
import com.sparta.usama.sort.BubbleSort;
import com.sparta.usama.sort.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BubbleSortTest extends ParentTest {

    @Override
    @BeforeEach
    protected void sorter() {
        sorter = new SortFactory().getSort("bubble");
    }

    @Test
    @DisplayName("Array Sorter for bubble")
    void testArray() {
        int[] testArray = {4,5,11,15,20,3,12};
        sorter = new BubbleSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {3,4,5,11,12,15,20};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @DisplayName("Test for an empty array")
    void emptyArrayTest() {
        int[] testArray = {};
        sorter = new BubbleSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @DisplayName("Testing an array of only one element")
    void oneElementArrayTest() {
        int[] testArray = {1};
        sorter = new BubbleSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {1};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }
}
