package Heaps;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " - Severity: " + severity;
    }
}

public class EmergencyRoomTriage {

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>(
                    (a, b) -> Integer.compare(b.severity, a.severity)
            );

    public void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public Patient peekNext() {
        return triageQueue.peek();
    }

    public static void main(String[] args) {

        EmergencyRoomTriage er = new EmergencyRoomTriage();

        er.addPatient(new Patient("Rahul", 5));
        er.addPatient(new Patient("Aman", 9));
        er.addPatient(new Patient("Nitsh", 7));

        System.out.println("Next Patient: " + er.peekNext());

        System.out.println("Treating: " + er.treatNext());
        System.out.println("Treating: " + er.treatNext());
        System.out.println("Treating: " + er.treatNext());
    }
}