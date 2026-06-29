package Fitness_Tracker;

public class FitnessMain {
    static void main(String[] args) {
        FitnessDevice f=new FitnessDevice(500,50);
        f.logActivity();
        f.generateReport();
        f.sendAlert();

    }
}
