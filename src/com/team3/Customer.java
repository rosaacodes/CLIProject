package com.team3;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String surName;
    private int customerID;
    private String email;

    public Customer(String firstName, String surName, int customerID, String email) {
        this.firstName = firstName;
        this.surName = surName;
        this.customerID = customerID;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + firstName + '\'' +
                ", customerID=" + customerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerID == customer.customerID && Objects.equals(firstName, customer.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, customerID);
    }
}
