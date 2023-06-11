package com.codecool.diligentdeliveries.Models;

import com.codecool.diligentdeliveries.Models.Parcel;
import com.codecool.diligentdeliveries.Models.Report;

import java.util.*;


public class Rider {

    private String id;
    private String name;
    private int reattemptPerAddress;
    private int maximumReattempts;
    private List<Parcel> parcels;


    // Print the rider names

    public Rider( String name, int reattemptPerAddress, int maximumReattempts){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.reattemptPerAddress = reattemptPerAddress;
        this.maximumReattempts = maximumReattempts;
        this.parcels = new ArrayList<>();
    }

    public void addParcels(List<Parcel> parcels) {
        this.parcels.addAll(parcels);
    }

    public void startRoutine() {
        System.out.println("Rider: " + name);
        System.out.println("Received Parcels:");

        for (Parcel parcel : parcels) {
            System.out.println("- Parcel ID: " + parcel.getId());
            System.out.println("  Delivery Information: " + parcel.getAddress());
            System.out.println("  Delivery Successful: " + parcel.delivered());
            System.out.println();
        }
        System.out.println("------------------------------");
    }


    //private boolean reattempt(Parcel parcel)
    {
        //Implement
    }

    private void handleSuccessfulDelivery(Parcel parcel)
    {
        //Implement
    }

    //public Report getReport()
    {
        //Implement
    }
}
