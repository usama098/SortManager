package com.sparta.usama.Controller;

import com.sparta.usama.print.Printer;
import com.sparta.usama.sort.ArrayGenerator;
import com.sparta.usama.sort.BubbleSort;

public class DisplayManager {
    public static void start() {
        System.out.println("Welcome to Sort Manager. \nSelect the size of the array below");
        SortManager.start();
        DisplayManager.showArray();
    }

    public static void showArray() {
        Printer.printString("The generated random array is the following: ");
        int[] newArray = ArrayGenerator.generateIntArray(SortManager.inputLength);
        Printer.printIntArray(newArray);

    }

    public static void showBubbleSorted(int [] passedArray) {
        int[] sortedArray = BubbleSort.sortArray(newArray);
    }

    public static void showMergeSorted(int[] passedArray) {

    }
}
