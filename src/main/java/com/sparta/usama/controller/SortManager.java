package com.sparta.usama.controller;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SortManager {

    public static int inputLength = 0;
    public static String sortAlgorithm = "";

    public static void length() {

        boolean validInput = false;

        while (validInput == false) {
            Scanner myObject = new Scanner(System.in);
            try {
                inputLength = myObject.nextInt();
                validInput = true;
            } catch (InputMismatchException msg) {
                System.out.println("Input Mismatch Exception has occurred " + msg.getMessage());
            }
        }
    }
    public static void sorting(){
        boolean validInput = false;

        while(validInput == false) {
            Scanner myObject = new Scanner(System.in);
            try {
                sortAlgorithm = myObject.nextLine();
                sortAlgorithm = sortAlgorithm.toLowerCase();
                if (sortAlgorithm.equals("bubble") || sortAlgorithm.equals("merge")){
                    validInput = true;
                } else{
                    validInput = false;
                    System.out.println("Invalid Entry!");
                }
            } catch (InputMismatchException msg) {
                System.out.println("Input Mismatch Exception has occurred " + msg.getMessage());
            }
        }
    }
}
