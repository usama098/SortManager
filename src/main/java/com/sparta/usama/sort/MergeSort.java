package com.sparta.usama.sort;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] inputArray) {

        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("nothing here, look away young one");
        }

        if (isArraySorted(inputArray)) {
            throw new IllegalArgumentException("bro its already sorted dawg, don't stress");
        }

        return mergeSortArray(inputArray, 0, inputArray.length - 1);
    }


    private int[] mergeArray(int[] numberArray, int beginIndex, int midIndex,int endIndex){

        int leftLength = midIndex - beginIndex + 1;
        int rightLength = endIndex - midIndex;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        if (leftLength >= 0) {
            System.arraycopy(numberArray, beginIndex, leftArray, 0, leftLength);
        }

        if (rightLength >= 0) {
            System.arraycopy(numberArray, midIndex + 1, rightArray, 0, rightLength);
        }

        int leftIndex = 0, rightIndex = 0;
        int count = beginIndex;
        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                numberArray[count] = leftArray[leftIndex];
                leftIndex++;
            } else {
                numberArray[count] = rightArray[rightIndex];
                rightIndex++;
            }
            count++;
        }
        while (leftIndex < leftLength) {
            numberArray[count] = leftArray[leftIndex];
            rightIndex++;
            count++;
        }
        return numberArray;


    }

    private boolean isArraySorted(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > numberArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    private int[] combineTwoArrays(int[] numberArray1, int[] numberArray2) {
        int[] arraysCombined = new int[numberArray1.length + numberArray2.length];
        System.arraycopy(numberArray1, 0, arraysCombined, 0, numberArray1.length);
        System.arraycopy(numberArray2, 0, arraysCombined, numberArray1.length, numberArray2.length);

        return arraysCombined;

    }

    private int[] mergeSortArray(int[] numberArray, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int midIndex = (beginIndex + endIndex) / 2;
            numberArray = mergeSortArray(numberArray, beginIndex, midIndex);
            numberArray = mergeSortArray(numberArray, midIndex + 1, endIndex);

            return mergeArray(numberArray, beginIndex, midIndex, endIndex);
        }
        return numberArray;
    }

}
