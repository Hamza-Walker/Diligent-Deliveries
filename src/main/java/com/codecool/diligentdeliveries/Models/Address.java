package com.codecool.diligentdeliveries.Models;

public class Address {
    private final String zipCode;
    private final String StreetAddress;
    private final String customerNAme;

    public Address(String zipCode, String streetAddress, String customerNAme) {
        this.zipCode = zipCode;
        StreetAddress = streetAddress;
        this.customerNAme = customerNAme;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public String getCustomerNAme() {
        return customerNAme;
    }

    @Override
    public String toString() {
        return
                "zipCode='" + zipCode + '\'' +
                ", StreetAddress='" + StreetAddress + '\'' +
                ", customerNAme='" + customerNAme + '\'';
    }
}
