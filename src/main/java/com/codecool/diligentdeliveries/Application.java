package com.codecool.diligentdeliveries;


import com.codecool.diligentdeliveries.Data.RiderNameGenerator;
import com.codecool.diligentdeliveries.Models.Address;
import com.codecool.diligentdeliveries.Models.Parcel;
import com.codecool.diligentdeliveries.Models.Rider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        testParcels();
        //testRiderNames();
    }
    private static void testRiderNames() {
        RiderNameGenerator rider = new RiderNameGenerator();
        List<String> names = rider.getRiderNames();
        System.out.println(names);
    }


    private static void testParcels() {
        List<Rider> riders = createRiders(3); // Create 3 riders

        List<Parcel> parcels = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            String streetAddress = getRandomStreetAddress();
            Address address = new Address("5678", streetAddress, "Jane Smith");
            Parcel parcel = new Parcel(address);
            parcels.add(parcel);
        }

        // Assign the parcels to the riders
        int riderIndex = 0;
        for (Parcel parcel : parcels) {
            Rider rider = riders.get(riderIndex);
            rider.addParcels(Collections.singletonList(parcel));

            // Move to the next rider
            riderIndex = (riderIndex + 1) % riders.size();
        }

        // Start the routine for each rider
        for (Rider rider : riders) {
            rider.startRoutine();
        }
    }

    private static List<Rider> createRiders(int count) {
        List<Rider> riders = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String riderName = "Rider " + (i + 1);
            int reattemptPerAddress = 1; // Set the desired reattempt per address value
            int maximumReattempts = 5; // Set the maximum reattempts value
            Rider rider = new Rider(riderName, reattemptPerAddress, maximumReattempts);
            riders.add(rider);
        }

        return riders;
    }
}
