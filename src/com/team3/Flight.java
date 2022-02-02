package com.team3;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private int flightID;
    private Destination destination;
    private double price;
    private LocalDateTime depature;
    private int capacity;






    public Flight( int flightID,
        Destination destination,
        double price,
        LocalDateTime departure){
            this.flightID = flightID;
            this.destination = destination;
            this.price = price;
            this.depature = departure;
//            int noOfObjects = 0;
//       public noOfObjects() {
//                noOfObjects++;
            }



        public int getFlightID () {
            return flightID;
        }

        public void setFlightID ( int flightID){
            this.flightID = flightID;
        }

        public Destination getDestination () {
            return destination;
        }

        public void setDestination (Destination destination){
            this.destination = destination;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public LocalDateTime getDepature () {
            return depature;
        }

        public void setDepature (LocalDateTime depature){
            this.depature = depature;
        }

        public int getCapacity () {
            return capacity;
        }

        public void setCapacity ( int capacity){
            this.capacity = capacity;
        }

        @Override
        public String toString () {
            return "Flights{" +
                    "flightID=" + flightID +
                    ", destination=" + destination +
                    ", price=" + price +
                    ", depature=" + depature +
                    ", capacity=" + capacity +
                    '}';
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Flight flight = (Flight) o;
            return flightID == flight.flightID && Double.compare(flight.price, price) == 0 && capacity == flight.capacity && destination == flight.destination && Objects.equals(depature, flight.depature);
        }

        @Override
        public int hashCode () {
            return Objects.hash(flightID, destination, price, depature, capacity);
        }


    }
