package com.codecool.diligentdeliveries.Models;

import com.codecool.diligentdeliveries.Models.Parcel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Rider {

    private String id;
    private String name;
    private int reattemptPerAddress;
    private int maximumReattempts;
    private int successfulDeliveries;
    private int reattemptsLeft;
    private List<Parcel> parcels;

    public Rider(String name, int reattemptPerAddress, int maximumReattempts) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.reattemptPerAddress = reattemptPerAddress;
        this.maximumReattempts = maximumReattempts;
        this.successfulDeliveries = 0;
        this.reattemptsLeft = maximumReattempts;
        this.parcels = new ArrayList<>();
    }

    public void addParcels(List<Parcel> parcels) {
        this.parcels.addAll(parcels);
    }

    public void startRoutine() {
        System.out.println("Rider: " + name);
        System.out.println("Received Parcels:");
        for (Parcel parcel : parcels) {
            boolean deliverySuccessful = parcel.deliver();
            if (deliverySuccessful) {
                handleSuccessfulDelivery(parcel);
            } else {
                boolean reattempted = reattempt(parcel);
                if (reattempted) {
                    handleSuccessfulDelivery(parcel);
                }
            }
            System.out.println(parcel);
        }
        System.out.println("------------------------------");
    }

    private boolean reattempt(Parcel parcel) {
        if (reattemptsLeft > 0) {
            reattemptsLeft--;
            System.out.println("Re-attempting delivery for parcel ID: " + parcel.getId());
            return true;
        }
        return false;
    }

    private void handleSuccessfulDelivery(Parcel parcel) {
        successfulDeliveries++;
    }

    public int getSuccessfulDeliveries() {
        return successfulDeliveries;
    }

    public int getReattemptsLeft() {
        return reattemptsLeft;
    }

    public String getName() {
        return name;
    }
}
