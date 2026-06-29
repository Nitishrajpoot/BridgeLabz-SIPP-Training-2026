package ControlFlow;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony height: ");
        int anthonyHeight = sc.nextInt();

        String youngest = "";
        int minAge = Math.min(amarAge,
                     Math.min(akbarAge, anthonyAge));

        if (minAge == amarAge)
            youngest = "Amar";
        else if (minAge == akbarAge)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        String tallest = "";
        int maxHeight = Math.max(amarHeight,
                        Math.max(akbarHeight, anthonyHeight));

        if (maxHeight == amarHeight)
            tallest = "Amar";
        else if (maxHeight == akbarHeight)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
    }
}