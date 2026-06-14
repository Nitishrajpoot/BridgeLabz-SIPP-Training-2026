import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays
        int[] age = new int[3];
        double[] height = new double[3];

        // Input
        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter details for " + friends[i]);

            System.out.print("Enter Age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter Height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Compare values
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest Friend:");
        System.out.println(
            friends[youngestIndex] +
            " (Age = " + age[youngestIndex] + ")"
        );

        System.out.println("\nTallest Friend:");
        System.out.println(
            friends[tallestIndex] +
            " (Height = " + height[tallestIndex] + " cm)"
        );

        sc.close();
    }
}