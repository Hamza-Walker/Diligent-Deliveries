package com.codecool.diligentdeliveries.Data;

import com.codecool.diligentdeliveries.Models.Rider;

import java.util.*;

public class ParcelGenerator {
    // generate a list with the three riders
    RiderNameGenerator generator = new RiderNameGenerator();
    List<String> riderNames = generator.getRiderNames();





    private static final Random random = new Random();
    private static String getRandomStreetAddress() {
        return "Random Street "
                + random.nextInt(100, 1000)
                + " Number " + random.nextInt(0, 100);
    }
}
