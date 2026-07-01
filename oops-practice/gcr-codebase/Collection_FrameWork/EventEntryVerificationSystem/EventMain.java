package EventEntryVerificationSystem;

import java.util.Scanner;

public class EventMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EventManager event = new EventManager();

        while (true) {

            System.out.println("\n===== EVENT ENTRY VERIFICATION =====");

            System.out.println("1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Email ID: ");
                    String email = sc.nextLine();

                    event.registerParticipant(email);

                    break;

                case 2:

                    event.displayParticipants();

                    break;

                case 3:

                    System.out.println("Program Closed");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}