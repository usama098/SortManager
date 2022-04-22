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
        if(SortManager.sortAlgorithm.equals("bubble")){
            System.out.println("time taken in ms to execute bubble algorithm: ");
            System.out.println((BubbleSort.endTime - BubbleSort.startTime)/1000000);
        } else {
            System.out.println("time in ms taken to execute Merge algorithm: ");
            System.out.println((MergeSort.endTime - MergeSort.startTime)/1000000);
        }




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
