package com.sparta.usama.parent;

import com.sparta.usama.sort.ArrayGenerator;
import com.sparta.usama.sort.Sorter;
import org.junit.jupiter.api.BeforeEach;


public abstract class ParentTest {
    public Sorter sorter;
    public int[] numberArray;
    public int[] sortedArray = {1,2,3,4,5,6,7,8,9,10,11};

    @BeforeEach
    public void setup () {
        numberArray = ArrayGenerator.generateIntArray(50,-50,50);
    }

    public boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    protected abstract void sorter();
}
