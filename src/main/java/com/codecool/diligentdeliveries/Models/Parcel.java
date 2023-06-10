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

    public boolean delivered() {
        Random random = new Random();

        return random.nextDouble() > 0.5;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id='" + id + '\'' +
                ", address=" + address +
                '}';
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
