package BankAccount;

import java.util.Scanner;

public class BankUtitlity {

    BankCustomer bankCustomer;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        int account_number = (int) (Math.random() * 900000) / 100000;
        String name = sc.nextLine();
        double balance = 50000;
        bankCustomer = new BankCustomer(account_number, name, balance);
        System.out.println("Account Created");
        BankCustomer.Bank_TotalAccountNumber++;

    }
    public void withDraw(double amount){
        if(amount>bankCustomer.Bank_Balance){
    System.out.println("Insufficient Balance");
}
        else{
            bankCustomer.Bank_Balance -=amount;
            System.out.println("Withdrawl Amount is "+amount);
            System.out.println("Bank balance is "+bankCustomer.Bank_Balance);
        }

}


    public void deposit(double amount) {

        BankCustomer.Bank_TotalAccountNumber++;

        if (amount < 0) {
            System.out.println("Invaid Amount!!");

        } else {
            bankCustomer.Bank_Balance += amount;
            System.out.println("Deposited Amount is "+amount);
            System.out.println("Current balance is "+bankCustomer.Bank_Balance);

        }

    }
    public void getStatement(){

        System.out.println(bankCustomer.toString());
    }

    public void totalAccounts() {
        System.out.println("Total Accounts Created : "
                + BankCustomer.Bank_TotalAccountNumber);
    }



}


