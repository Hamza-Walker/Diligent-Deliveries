package com.codecool.diligentdeliveries;


import com.codecool.diligentdeliveries.Models.Address;
import com.codecool.diligentdeliveries.Models.Parcel;

import java.util.Random;

public class Application {



    private static final Random random = new Random();

    private static String getRandomStreetAddress() {
        return "Random Street "
                + random.nextInt(100, 1000)
                + " Number " + random.nextInt(0, 100);
    }

    public static void main(String[] args) {
        // Test the Address class

        // Test the Parcel class
        testParcel();
    }



    private static void testParcel() {
        String streetAddress = getRandomStreetAddress();

        // Create an instance of Address
        Address address = new Address("5678", streetAddress, "Jane Smith");

        // Create an instance of Parcel
        Parcel parcel = new Parcel(address);

        // Test the getId() method of Parcel
        System.out.println("Parcel ID: " + parcel.getId());

        // Test the delivered() method of Parcel
        boolean deliveryResult = parcel.delivered();
        System.out.println("Delivery Information: " + address);
        System.out.println("Delivery successful: " + deliveryResult);
    }
}
