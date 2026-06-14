import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        number = Math.abs(number);

        // Special case for 0
        if (number == 0) {
            System.out.println("Digit 0 → Frequency = 1");
            return;
        }

        // Count digits
        long temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits
        int[] digits = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Frequency array
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display digits array
        System.out.print("\nStored Digits: ");

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }

        // Display frequency
        System.out.println("\n\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {

            if (frequency[i] > 0) {
                System.out.println(
                    "Digit " + i +
                    " → " + frequency[i] + " time(s)"
                );
            }
        }

        sc.close();
    }
}