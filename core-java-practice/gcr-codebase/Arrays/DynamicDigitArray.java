import java.util.Scanner;

public class DynamicDigitArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        number = Math.abs(number);

        // Initial array size
        int maxDigit = 10;

        int[] digits = new int[maxDigit];

        int index = 0;

        // Store digits dynamically
        while (number != 0) {

            // Resize array if full
            if (index == maxDigit) {

                maxDigit += 10;

                int[] temp = new int[maxDigit];

                // Copy old data
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = (int)(number % 10);

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

        // Print stored digits
        System.out.print("\nStored Digits: ");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        // Result
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