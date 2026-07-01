package EventEntryVerificationSystem;

import java.util.HashSet;

public class EventManager {

    HashSet<String> participantList = new HashSet<>();

    // Register Participant
    public void registerParticipant(String email) {

        if (participantList.add(email)) {
            System.out.println("Registration Successful");
        } else {
            System.out.println("Duplicate Registration Not Allowed");
        }
    }

    // Display Participants
    public void displayParticipants() {

        if (participantList.isEmpty()) {
            System.out.println("No Participants Registered");
            return;
        }

        System.out.println("\nRegistered Participants:\n");

        for (String email : participantList) {
            System.out.println(email);
        }

        System.out.println(
                "\nTotal Eligible Attendees: "
                        + participantList.size());
    }
}