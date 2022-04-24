package com.sparta.usama.sortTests;

import com.sparta.usama.parent.ParentTest;
import com.sparta.usama.sort.ArrayGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayGeneratorTest extends ParentTest {
    @Override
    protected void sorter() {

    }

    @Test
    @DisplayName("Array length test")
    void lengthTest(){
        assertFalse(isArraySorted(ArrayGenerator.generateIntArray(20)));
    }

    @Test
    @DisplayName("Boundary test with an array length of 50")
    void boundTestOne() {
        assertFalse(isArraySorted(ArrayGenerator.generateIntArray(50, -1000, 1000)));
    }

    @Test
    @DisplayName("Boundary test with an array length of 500")
    void boundTestTwo() {
        assertFalse(isArraySorted(ArrayGenerator.generateIntArray(500, -10000, 10000)));
    }

}
