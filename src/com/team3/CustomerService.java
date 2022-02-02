package com.team3;

import java.util.Scanner;

public class CustomerService {

    public static void firstScanner() {
        // Print welcome message for user
        System.out.println("Welcome to the Flight Booking System!");
        // Request user input - enter ID
        System.out.println("Please enter your ID:");
        // Create scanner variable that stores user input
        Scanner scannerID = new Scanner(System.in);
        // Read user input and stores in input variable
        int inputID = scannerID.nextInt();
        System.out.println("ID: " + inputID);     // delete


        // If ID inputted is correct
        Boolean repeatPasswordEntry = true;
        while (repeatPasswordEntry) {
            if (inputID == 123) {
                Scanner scannerPassword = new Scanner(System.in);
                System.out.println("Input your password: ");
                String inputPassword = scannerPassword.nextLine();
                if (inputPassword.equals("password")) {
                    System.out.println("Welcome Nelson!");
                    repeatPasswordEntry = false;
                } else {
                    System.out.println("Wrong password, please try again:");
                    repeatPasswordEntry = true;
                }}
                else{
                    System.out.println("Wrong ID, please try again: ");

                }
            }


        }

    }


