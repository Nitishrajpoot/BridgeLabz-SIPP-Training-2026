package AddressBookApp;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook book = new AddressBook();

        while (true) {

            System.out.println("\n===== ADDRESS BOOK =====");
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    book.addContact(name, phone, email);
                    break;

                case 2:

                    System.out.print("Enter Name to Search: ");
                    name = sc.nextLine();

                    book.searchContact(name);
                    break;

                case 3:

                    System.out.print("Enter Name to Delete: ");
                    name = sc.nextLine();

                    book.deleteContact(name);
                    break;

                case 4:

                    book.displayContacts();
                    break;

                case 5:

                    System.out.println("Program Closed");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}