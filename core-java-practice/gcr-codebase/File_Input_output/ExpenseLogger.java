import java.io.*;
import java.util.*;

public class ExpenseLogger {

    public static void main(String[] args)
            throws Exception {

        Scanner sc=new Scanner(System.in);

        FileWriter fw=
                new FileWriter(
                        "expenses.txt",
                        true
                );

        System.out.print("Category: ");
        String type=sc.nextLine();

        System.out.print("Amount: ");
        int amount=sc.nextInt();

        fw.write(type+" - "+amount+"\n");

        fw.close();

        System.out.println("Saved");
    }
}