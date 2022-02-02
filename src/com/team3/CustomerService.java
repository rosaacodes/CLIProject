package com.team3;

import java.util.Scanner;

public class CustomerService {

    public void firstScanner() {

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
        Boolean repeatIDEntry = true;

        while (repeatIDEntry || repeatPasswordEntry) {

            if (inputID == 123) {
                Scanner scannerPassword = new Scanner(System.in);
                System.out.println("Input your password: ");
                String inputPassword = scannerPassword.nextLine();
                if (inputPassword.equals("password")) {
                    System.out.println("Welcome Nelson!");
                    System.out.println("----------------");
                    repeatPasswordEntry = false;
                    repeatIDEntry = false;
                    options();
                } else {
                    System.out.println("Wrong password, please try again:");
                    repeatPasswordEntry = true;
                    repeatIDEntry = false;
                }
            } else {
                System.out.println("Wrong ID, please try again: ");
                repeatIDEntry = true;
                scannerEntry();

            }
        }


    }



    public void scannerEntry() {  //removed static
        System.out.println("Please enter your ID:");
        // Create scanner variable that stores user input
        Scanner scannerID = new Scanner(System.in);
        // Read user input and stores in input variable
        int inputID = scannerID.nextInt();
    }

    public void options() {
        System.out.println("Enter the following numbers to choose the service you would like to use today");
        System.out.println("1. View available flights");
        System.out.println("2. Manage bookings");
        Scanner scannerOptions = new Scanner(System.in);
        int optioninput = scannerOptions.nextInt();
        if(optioninput==1) {
            //let user view flights
            System.out.println("Here are all the available flights for you to choose from");
        }
        else if (optioninput==2) {
            System.out.println("Would you like to:");
            System.out.println("1. View all your current bookings");
            System.out.println("2. Add a booking");
            Scanner scannerManagebooking = new Scanner(System.in);
            int manageBookingInput = scannerManagebooking.nextInt();
            if(manageBookingInput==1) {
                //method to view current bookings
            }
            else if(manageBookingInput==2) {
                System.out.println("hi");
                // method to add booking
            }
            else {
                System.out.println("Input not recognised, please try again");
            }
        }
        else {                                                              //could throw exception?
            System.out.println("Input not recognised, please try again");
        }

    }
}