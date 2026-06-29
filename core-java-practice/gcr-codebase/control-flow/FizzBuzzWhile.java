package ControlFlow;
import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        int number = sc.nextInt();

        int i = 1;

        if (number <= 0) {
            System.out.println("Enter positive number");
        }
        else {
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }

                i++;
            }
        }
    }
}
