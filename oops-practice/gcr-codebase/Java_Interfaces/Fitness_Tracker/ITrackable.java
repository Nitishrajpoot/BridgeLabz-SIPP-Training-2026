package Fitness_Tracker;

public interface ITrackable {
    void logActivity();

    default void resetData(){
        System.out.println("________________________________________");
        System.out.println("Your data has been reset");
        System.out.println("_________________________________________");
    }

}
