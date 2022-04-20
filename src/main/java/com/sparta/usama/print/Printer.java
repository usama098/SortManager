package com.sparta.usama.print;

import java.util.Arrays;
public class Printer {
    public static void printString(String message) {
        System.out.println(message);
    }
    public static void printString() {
        System.out.println();
    }

    public static void printIntArray(int[] numberArray) {
        System.out.println(Arrays.toString(numberArray));
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }

    public static void printInt(int number) {
        System.out.println(number);
    }

    public static void printPerformanceTestString(String message, long time) {
        System.out.printf(message, time);
    }
}
