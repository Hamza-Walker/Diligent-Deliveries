package com.codecool.diligentdeliveries.Models;

public class Report {
    private String riderName;
    private int reattemptsLeft;
    private int successfulDeliveries;

    public Report(String riderName, int reattemptsLeft, int successfulDeliveries) {
        this.reattemptsLeft = reattemptsLeft;
        this.successfulDeliveries = successfulDeliveries;
        this.riderName = riderName;
    }

    public String getRiderName() {
        return riderName;
    }

    public int getReattemptsLeft() {
        return reattemptsLeft;
    }

    public int getSuccessfulDeliveries() {
        return successfulDeliveries;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reattemptsLeft=" + reattemptsLeft +
                ", successfulDeliveries=" + successfulDeliveries +
                '}';
    }
}
