import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array and total
        double[] numbers = new double[10];
        double total = 0.0;

        int index = 0;

        // Input loop
        while (true) {

            // Check array limit
            if (index == 10) {
                System.out.println("Array limit reached (10 values).");
                break;
            }

            System.out.print("Enter number: ");
            double value = sc.nextDouble();

            // Stop if 0 or negative
            if (value <= 0) {
                break;
            }

            // Store value
            numbers[index] = value;
            index++;
        }

        // Print numbers and calculate total
        System.out.println("\nStored Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Print total
        System.out.println("\n\nTotal Sum = " + total);

        sc.close();
    }
}