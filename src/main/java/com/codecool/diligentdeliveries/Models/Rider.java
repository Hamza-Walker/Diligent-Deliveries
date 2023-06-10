package com.codecool.diligentdeliveries.Models;

import com.codecool.diligentdeliveries.Models.Parcel;
import com.codecool.diligentdeliveries.Models.Report;

import java.util.ArrayList;
import java.util.UUID;

public class Rider {

    private String id;
    private String name;

    public Rider( int reattemptPerAddress, int maximumReattempts){
        this.id = UUID.randomUUID().toString();

    }

    public void addParcels(ArrayList<Parcel> parcels){
        //Implement
    }

    public void startRoutine()
    {
        //Implement
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
