package com.sparta.usama.sort;

public class BubbleSort implements Sorter {
    private static int[] numberArray;
    public static long startTime = 0;
    public static long endTime = 0;
    
    
    @Override
    public int[] sortArray(int[] inputArray) {
        startTime =  System.nanoTime(); 
        int n = inputArray.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (inputArray[j] > inputArray[j + 1]) {
                    // swap inputArray[j+1] and inputArray[j]
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
        endTime =  System.nanoTime(); 
        return numberArray;
    }
    
}
