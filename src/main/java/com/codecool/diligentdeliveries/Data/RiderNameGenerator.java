package com.codecool.diligentdeliveries.Data;

import java.util.*;

public class RiderNameGenerator {
    private List<String> riderNames;
    public RiderNameGenerator() {
        riderNames = new ArrayList<>();
        riderNames.add("Alan Walker");
        riderNames.add("John Smith");
        riderNames.add("Emily Johnson");
    }

    public List<String> getRiderNames() {
        return riderNames;
    }

    @Override
    public String toString() {
        return riderNames.toString();

    }
}
