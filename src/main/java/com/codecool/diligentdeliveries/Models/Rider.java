package com.codecool.diligentdeliveries.Models;

import com.codecool.diligentdeliveries.Models.Parcel;
import com.codecool.diligentdeliveries.Models.Report;

import java.util.ArrayList;

public class Rider {

    private int id;
    private String name;

    public Rider(int id, int reattemptPerAddress, int maximumReattempts){
        //Initialize members
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
