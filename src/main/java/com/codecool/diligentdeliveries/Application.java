import com.codecool.diligentdeliveries.Models.Address;
import com.codecool.diligentdeliveries.Models.Parcel;
import com.codecool.diligentdeliveries.Models.Rider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    private static final int TOTAL_PARCELS = 30;
    private static final int TOTAL_RIDERS = 3;

    public static void main(String[] args) {
        // Create riders
        List<Rider> riders = createRiders();

        // Generate parcels
        List<Parcel> parcels = generateParcels();

        // Assign parcels to riders
        assignParcelsToRiders(parcels, riders);

        // Start routine for each rider
        for (Rider rider : riders) {
            rider.startRoutine();
        }

        // Determine the winning riders
        List<Rider> winningRiders = getWinningRiders(riders);

        // Display the winning riders
        displayWinningRiders(winningRiders);
    }

    private static List<Rider> createRiders() {
        List<Rider> riders = new ArrayList<>();
        riders.add(new Rider("Rider 1", 1, 5));
        riders.add(new Rider("Rider 2", 2, 5));
        riders.add(new Rider("Rider 3", 3, 5));
        return riders;
    }

    private static List<Parcel> generateParcels() {
        List<Parcel> parcels = new ArrayList<>();
        for (int i = 0; i < TOTAL_PARCELS; i++) {
            Address address = new Address("1234", "Street " + i, "Customer " + i);
            Parcel parcel = new Parcel(address);
            parcels.add(parcel);
        }
        return parcels;
    }

    private static void assignParcelsToRiders(List<Parcel> parcels, List<Rider> riders) {
        int riderIndex = 0;
        for (Parcel parcel : parcels) {
            Rider rider = riders.get(riderIndex);
            rider.addParcels(Collections.singletonList(parcel));
            riderIndex = (riderIndex + 1) % riders.size();
        }
    }

    private static List<Rider> getWinningRiders(List<Rider> riders) {
        int maxSuccessfulDeliveries = 0;
        for (Rider rider : riders) {
            if (rider.getSuccessfulDeliveries() > maxSuccessfulDeliveries) {
                maxSuccessfulDeliveries = rider.getSuccessfulDeliveries();
            }
        }
        List<Rider> winningRiders = new ArrayList<>();
        for (Rider rider : riders) {
            if (rider.getSuccessfulDeliveries() == maxSuccessfulDeliveries) {
                winningRiders.add(rider);
            }
        }
        return winningRiders;
    }

    private static void displayWinningRiders(List<Rider> winningRiders) {
        System.out.println("Winning Riders:");
        for (Rider rider : winningRiders) {
            System.out.println(rider.getName() + " delivered " + rider.getSuccessfulDeliveries()
                    + " packages out of " + TOTAL_PARCELS + " (" + rider.getReattemptsLeft() + " reattempts left)");
        }
    }
}
