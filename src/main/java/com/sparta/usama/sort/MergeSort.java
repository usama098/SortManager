package com.sparta.usama.sort;


public class MergeSort implements Sorter {

    public static long startTime = 0;
    public static long endTime = 0;

    @Override
    public int[] sortArray(int[] inputArray) {
        startTime = System.nanoTime();
        mergeArray(inputArray, inputArray.length);
        endTime = System.nanoTime();
        return inputArray;
    }

    private int[] mergeArray(int[]inputArray, int n){
        n = inputArray.length;
        if (n < 2) {
            return inputArray;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = inputArray[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = inputArray[i];
        }
        mergeArray(l, mid);
        mergeArray(r, n - mid);

        merge(inputArray, l, r, mid, n - mid);
        return inputArray;
    }
    public static void merge(int[] inputArray, int [] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                inputArray[k++] = l[i++];
            }
            else {
                inputArray[k++] = r[j++];
            }
        }
        while (i < left) {
            inputArray[k++] = l[i++];
        }
        while (j < right) {
            inputArray[k++] = r[j++];
        }

    }
}
