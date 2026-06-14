import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D Array
        double[][] personData = new double[number][3];

        // Status Array
        String[] weightStatus = new String[number];

        // Input
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height (m): ");
            double height = sc.nextDouble();

            // Validation
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--;
                continue;
            }

            // Store
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculate BMI and Status
        for (int i = 0; i < number; i++) {

            double bmi =
                personData[i][0] /
                (personData[i][1] * personData[i][1]);

            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi < 25) {
                weightStatus[i] = "Normal";
            }
            else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        // Display Report
        System.out.println("\nBMI REPORT");

        for (int i = 0; i < number; i++) {

            System.out.println(
                "\nPerson " + (i + 1)
            );

            System.out.println(
                "Weight = " +
                personData[i][0] + " kg"
            );

            System.out.println(
                "Height = " +
                personData[i][1] + " m"
            );

            System.out.println(
                "BMI = " +
                String.format("%.2f",
                personData[i][2])
            );

            System.out.println(
                "Status = " +
                weightStatus[i]
            );
        }

        sc.close();
    }
}