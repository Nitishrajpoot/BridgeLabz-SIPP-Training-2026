package BankAccount;

import java.util.Scanner;

public class BankMenu {
    public void bankDisplay(){
        BankUtitlity bankUtitlity=new BankUtitlity();
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome To SBI BANK");
        System.out.println("------------------------------------------------");
        System.out.println("1.Create Account\n2.DEPOSIT\n3.WITHDRAWL\n 4.GET STATEMENT\n5. Total Account\n6.EXIST ");

        while (true){
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            if(choice==6)
                break;

            switch (choice){
                case 1:
                    bankUtitlity.createAccount();
                    break;

                case 2:
                    System.out.println("Enter amount to deposit");
                    double amount=sc.nextDouble();
                    bankUtitlity.deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter amount to deposit");
                    amount=sc.nextDouble();
                    bankUtitlity.withDraw(amount);
                    break;

                case 4:
                    bankUtitlity.getStatement();
                    break;

                case 5:
                    bankUtitlity.totalAccounts();
                    break;


                default:
                    System.out.println("Invaild choice");
            }
        }


    }
}
