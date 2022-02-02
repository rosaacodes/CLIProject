package com.team3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Airport {

    private String name;
    private Flight[] scheduledFlights = new Flight[5];
    private int capacity;


    public Airport(String name, int capacity) {
        this.name = name;
        this.scheduledFlights = new Flight[capacity];
    }



    public void flightListCustomer () {
        List<Flight> flightList = new ArrayList<>();
        flightList.add();
        flightList.add(flightTwo);
        flightList.remove(flightTwo);


        System.out.println(flightList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getScheduledFlights() {
        return scheduledFlights;
    }

    public void setScheduledFlights(Flight[] scheduledFlights) {
        this.scheduledFlights = scheduledFlights;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", scheduledFlights=" + Arrays.toString(scheduledFlights) +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return capacity == airport.capacity && Objects.equals(name, airport.name) && Arrays.equals(scheduledFlights, airport.scheduledFlights);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capacity);
        result = 31 * result + Arrays.hashCode(scheduledFlights);
        return result;
    }
}
