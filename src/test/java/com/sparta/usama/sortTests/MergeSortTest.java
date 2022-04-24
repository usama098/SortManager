package com.sparta.usama.sortTests;

import com.sparta.usama.parent.ParentTest;
import com.sparta.usama.sort.MergeSort;
import com.sparta.usama.sort.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest extends ParentTest {

    @Override
    @BeforeEach
    protected void sorter() {
        sorter = new SortFactory().getSort("bubble");
    }

    @Test
    @DisplayName("Testing Merge Sort with regular array")
    void testArray() {
        int[] testArray = {9,8,7,6,5,4,3,2,1};
        sorter = new MergeSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {1,2,3,4,5,6,7,8,9};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @DisplayName("Test for an empty array")
    void emptyArrayTest() {
        int[] testArray = {};
        sorter = new MergeSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @DisplayName("Testing an array of only one element")
    void oneElementArrayTest() {
        int[] testArray = {5};
        sorter = new MergeSort();
        sorter.sortArray(testArray);
        int[] expectedArray = {5};
        Assertions.assertArrayEquals(testArray, expectedArray);
    }


}
