package com.sparta.usama.Controller;

import com.sparta.usama.sort.ArrayGenerator;

import java.util.Scanner;

public class SortManager {

    public static int inputLength = 0;

    public static void start() {

        Scanner myObject = new Scanner(System.in);
        inputLength = Integer.parseInt(myObject.nextLine());
    }
}
