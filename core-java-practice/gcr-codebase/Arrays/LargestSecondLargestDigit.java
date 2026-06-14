import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        int maxDigit = 10;

        // Array to store digits
        int[] digits = new int[maxDigit];

        int index = 0;

        // Store digits
        while (number != 0) {

            if (index == maxDigit) {
                break;
            }

            digits[index] = number % 10;
            number = number / 10;

            index++;
        }

        // Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest &&
                     digits[i] != largest) {

                secondLargest = digits[i];
            }
        }

        // Print digits
        System.out.print("\nStored Digits: ");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        // Output
        System.out.println("\nLargest Digit = " + largest);

        if (secondLargest == -1) {
            System.out.println("Second Largest Digit not found");
        } else {
            System.out.println(
                "Second Largest Digit = " + secondLargest
            );
        }

        sc.close();
    }
}