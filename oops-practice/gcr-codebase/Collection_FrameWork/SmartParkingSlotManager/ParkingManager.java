package SmartParkingSlotManager;

import java.util.ArrayList;

public class ParkingManager {

    ArrayList<String> vehicleList = new ArrayList<>();

    // Add Vehicle
    public void vehicleEntry(String vehicleNo) {

        if (vehicleList.contains(vehicleNo)) {
            System.out.println("Vehicle already parked.");
            return;
        }

        vehicleList.add(vehicleNo);

        System.out.println("Vehicle Entered Successfully");
    }

    // Remove Vehicle
    public void vehicleExit(String vehicleNo) {

        if (vehicleList.remove(vehicleNo)) {
            System.out.println("Vehicle Exited Successfully");
        } else {
            System.out.println("Vehicle Not Found");
        }
    }

    // Search Vehicle
    public void searchVehicle(String vehicleNo) {

        if (vehicleList.contains(vehicleNo)) {
            System.out.println("Vehicle is Currently Parked");
        } else {
            System.out.println("Vehicle Not Parked");
        }
    }

    // Display Vehicles
    public void displayVehicles() {

        if (vehicleList.isEmpty()) {
            System.out.println("Parking is Empty");
            return;
        }

        System.out.println("\nParked Vehicles:\n");

        for (String vehicle : vehicleList) {
            System.out.println(vehicle);
        }

        System.out.println("\nTotal Occupied Slots: " + vehicleList.size());
    }
}