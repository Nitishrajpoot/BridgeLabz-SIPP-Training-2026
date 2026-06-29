package String;

import java.util.Scanner;

public class StringLengthWithoutLength {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // Access character
                count++;
            }
        } catch (Exception e) {
            // Exception means end of string
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without length(): " + customLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}