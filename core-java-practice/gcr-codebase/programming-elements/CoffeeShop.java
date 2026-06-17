package programmingElement;
import java.util.Scanner;

public class CoffeeShop {
    String coffeeType;
    int quantity;

    public double calculatePrice(double price) {
        double bill = price * quantity;
        double gst = bill * 0.18;
        return bill + gst;
    }

    public void generateBill(double bill) {
        System.out.println("------------------------------------------");
        System.out.println("Coffee Type: " + coffeeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + bill);
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Select Coffee Type");
        System.out.println("1. Espresso - 150");
        System.out.println("2. Cappuccino - 200");
        System.out.println("3. Latte - 250");
        System.out.println("4. Black Coffee - 100");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        CoffeeShop coffee = new CoffeeShop();

        System.out.print("Enter Quantity: ");
        coffee.quantity = sc.nextInt();

        switch (choice) {
            case 1:
                coffee.coffeeType = "Espresso";
                coffee.generateBill(coffee.calculatePrice(150));
                break;

            case 2:
                coffee.coffeeType = "Cappuccino";
                coffee.generateBill(coffee.calculatePrice(200));
                break;

            case 3:
                coffee.coffeeType = "Latte";
                coffee.generateBill(coffee.calculatePrice(250));
                break;

            case 4:
                coffee.coffeeType = "Black Coffee";
                coffee.generateBill(coffee.calculatePrice(100));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}