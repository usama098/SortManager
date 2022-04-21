package com.sparta.usama.controller;

import com.sparta.usama.print.Printer;
import com.sparta.usama.sort.*;

public class DisplayManager {
    public static void start() {
        System.out.println("Welcome to Sort Manager. \nSelect the size of the array below");
        SortManager.start();
        int[] newArray = ArrayGenerator.generateIntArray(SortManager.inputLength);
        DisplayManager.showArray(newArray);
        Sorter s = SortFactory.getSort("bubble");
        s.sortArray(newArray);
        DisplayManager.showArray(newArray);

    }

    public static void showArray(int[] showNewArray) {
        Printer.printString("The generated random array is the following: ");

        Printer.printIntArray(showNewArray);

    }


//    public static void showBubbleSorted(int [] passedArray) {
//        int[] sortedArray = BubbleSort.sortArray(newArray);
//    }
//
//    public static void showMergeSorted(int[] passedArray) {
//        int[] sortedArray = MergeSort.sortArray(newArray);
//
//    }
}
