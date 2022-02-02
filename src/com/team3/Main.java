package com.team3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//      CustomerService customerService = new CustomerService();
        CustomerService.firstScanner();

        Flight flightOne = new Flight(1,Destination.Barbados,1.99, LocalDateTime.now());
        Flight flightTwo = new Flight(2,Destination.Brazil,3.99,LocalDateTime.now());

        Airport airportOne = new Airport("Best Airport");




    }
}
