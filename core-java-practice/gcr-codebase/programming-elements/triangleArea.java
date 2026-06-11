package programmingElement;

import java.util.Scanner;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = sc.nextDouble();

        // Area in square inches
        double areaInSqInches = 0.5 * base * height;

        // 1 inch = 2.54 cm
        // 1 square inch = 2.54 * 2.54 = 6.4516 square cm
        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.printf("Area in square inches = %.2f%n", areaInSqInches);
        System.out.printf("Area in square centimeters = %.2f%n", areaInSqCm);

        sc.close();
    }
}
