package com.sparta.usama.controller;

import com.sparta.usama.print.Printer;
import com.sparta.usama.sort.*;

public class DisplayManager {
    public static void start() {
        System.out.println("Welcome to Sort Manager. \n\n\tSelect the size of the array below");
        SortManager.length();
        System.out.println("\tSelect the type of the sorting algorithm options are: Bubble or Merge");
        SortManager.sorting();

        int[] newArray = ArrayGenerator.generateIntArray(SortManager.inputLength);
        DisplayManager.showArray(newArray, false);
        Sorter sorter = SortFactory.getSort(SortManager.sortAlgorithm);
        sorter.sortArray(newArray);
        DisplayManager.showArray(newArray, true);



    }

    public static void showArray(int[] showNewArray, boolean sorted) {
        if (sorted == false) {
            Printer.printString("The random generated array is the following: ");
            Printer.printIntArray(showNewArray);
        } else {
            Printer.printString("The sorted array is the following: ");
            Printer.printIntArray(showNewArray);
        }
    }

}
