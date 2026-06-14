import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check Natural Number
        if (number <= 0) {
            System.out.println("Error! Please enter a natural number.");
            return;
        }

        // Create arrays
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        // Store numbers
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print Odd Array
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print Even Array
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}