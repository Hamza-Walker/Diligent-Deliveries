package com.codecool.diligentdeliveries.Models;

public class Address {
    private final String zipCode;
    private final String streetAddress;
    private final String customerName;

    public Address(String zipCode, String streetAddress, String customerNAme) {
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
        this.customerName = customerNAme;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return customerName + ", " + streetAddress + ", " + zipCode;

    }
}
