package com.codecool.diligentdeliveries.Models;

import java.util.Random;
import java.util.UUID;

public class Parcel {
    private final String id;
    private final Address address;

    public Parcel( Address address) {
        this.id = UUID.randomUUID().toString();
        this.address = address;
    }

    public boolean deliver() {
        Random random = new Random();
        return random.nextDouble() > 0.5;
    }


    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "Parcel ID: " + id + "\n" +
                "Delivery Information: " + address + "\n" +
                "Delivery Successful: " + deliver() + "\n";
    }
}
