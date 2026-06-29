package Fitness_Tracker;

public class FitnessDevice implements ITrackable, IReportable,INotifiable {
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories) {
        this.steps = steps;
        this.calories = calories;

    }

    @Override
    public void logActivity() {
        System.out.println("______________________________________");
        System.out.println("Activity is logged");
        System.out.println("Steps " + steps);
        System.out.println("calories " + calories);
        System.out.println("_________________________________________");
    }

    @Override
    public void generateReport() {
        System.out.println("______________________________________");
        System.out.println("FITNESS REPORT");
        System.out.println("______________________________________");
        System.out.println("Total Steps" + steps);
        System.out.println("______________________________________");
        System.out.println("Calories Burned" + calories);

    }

    @Override
    public void sendAlert() {
        int remainingSteps = 5000 - steps;
        if (steps < 5000) {
            System.out.println("You need to more Steps " + remainingSteps + " steps");
        } else {
            System.out.println("Goal is 5000 steps is achived");
        }
    }
}

