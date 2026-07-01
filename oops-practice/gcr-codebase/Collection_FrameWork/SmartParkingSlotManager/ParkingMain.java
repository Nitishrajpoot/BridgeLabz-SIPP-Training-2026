package SmartParkingSlotManager;

import java.util.Scanner;

public class ParkingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingManager parking = new ParkingManager();

        while (true) {

            System.out.println("\n===== SMART PARKING MANAGER =====");

            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Vehicle Number: ");
                    String vehicle = sc.nextLine();

                    parking.vehicleEntry(vehicle);

                    break;

                case 2:

                    System.out.print("Enter Vehicle Number: ");
                    vehicle = sc.nextLine();

                    parking.vehicleExit(vehicle);

                    break;

                case 3:

                    System.out.print("Enter Vehicle Number: ");
                    vehicle = sc.nextLine();

                    parking.searchVehicle(vehicle);

                    break;

                case 4:

                    parking.displayVehicles();

                    break;

                case 5:

                    System.out.println("Program Closed");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}