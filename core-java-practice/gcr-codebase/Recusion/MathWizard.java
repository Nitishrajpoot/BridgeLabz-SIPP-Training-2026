package Recusion;
import java.util.Scanner;

class MathWizard {

    // Instance Variable
    int operationCount = 0;

    // Prime Check
    boolean isPrime(int n) {
        operationCount++;

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Factorial (int) using iteration
    long factorial(int n) {
        operationCount++;

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded factorial for double
    double factorial(double n) {
        operationCount++;

        double fact = 1;

        for (int i = 1; i <= (int)n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci
    void fibonacci(int n) {
        operationCount++;

        int a = 0, b = 1;

        System.out.print("Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // GCD
    int gcd(int a, int b) {
        operationCount++;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    int lcm(int a, int b) {
        operationCount++;

        return (a * b) / gcd(a, b);
    }

    // Power
    long power(int base, int exp) {
        operationCount++;

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demo
    void showScope() {

        // Local Variable
        int localVar = 100;

        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + operationCount);
    }
}

public class Main {
    public static void main(String[] args) {

        MathWizard obj = new MathWizard();

        System.out.println("Prime: " + obj.isPrime(17));

        System.out.println("Factorial(int): " +
                obj.factorial(5));

        System.out.println("Factorial(double): " +
                obj.factorial(5.0));

        obj.fibonacci(7);

        System.out.println("GCD: " +
                obj.gcd(24, 36));

        System.out.println("LCM: " +
                obj.lcm(24, 36));

        System.out.println("Power: " +
                obj.power(2, 5));

        obj.showScope();
    }
}