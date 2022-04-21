package com.sparta.usama.controller;

import com.sparta.usama.print.Printer;
import com.sparta.usama.sort.*;

public class DisplayManager {
    public static void start() {
        System.out.println("Welcome to Sort Manager. \nSelect the size of the array below");
        SortManager.start();
        int[] newArray = ArrayGenerator.generateIntArray(SortManager.inputLength);
        DisplayManager.showBubbleArray(newArray);
        Sorter sBubbleArray = SortFactory.getSort("bubble");
        sBubbleArray.sortArray(newArray);
        DisplayManager.showBubbleArray(newArray);

    }

    public static void showBubbleArray(int[] showNewArray) {
        Printer.printString("The generated random array is the following: ");
        Printer.printIntArray(showNewArray);
    }

}
