package com.team3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Airport airportOne = new Airport("Best Airport", 3);

        Flight flightOne = new Flight(1, Destination.Barbados, 1.99, LocalDateTime.now());
        Flight flightTwo = new Flight(2, Destination.Brazil, 3.99, LocalDateTime.now());
        Flight[] scheduledFlights = {flightOne, flightTwo};


//        airportOne.addFlightBooking(flightOne);
////        System.out.println(Arrays.toString(airportOne.getScheduledFlights()));
//
        for (Flight f : scheduledFlights) {
            airportOne.addFlightBooking(f);
        }

      CustomerService customerService = new CustomerService();
        customerService.firstScanner(airportOne);



//        airportOne.addFlightBooking(flightOne);
//
//        System.out.println(Arrays.toString(airportOne.getScheduledFlights()));
//
//        System.out.println(airportOne);
    }
}

//        public void flightListCustomer (Flight flight) {
//            List<Flight> flightList = new ArrayList<>();
//            flightList.add(flightOne);
//            flightList.add(flightTwo);
//            flightList.remove(flightTwo);
//
//
//            System.out.println(flightList);
//        FlightService flightService = new FlightService();
//        FlightService.displayFlights(airportOne);


