package String;

import java.util.Scanner;

public class StudentVotingEligibility {

    static int[] inputAges(
            int students,
            Scanner sc) {

        int[] ages =
                new int[students];

        for (
                int i = 0;
                i < students;
                i++) {

            System.out.print(
                    "Age "
                            +
                            (i + 1)
                            +
                            ": ");

            ages[i] =
                    sc.nextInt();
        }

        return ages;
    }

    static String[][] checkVoting(
            int[] ages) {

        String[][] table =
                new String
                        [ages.length][2];

        for (
                int i = 0;
                i < ages.length;
                i++) {

            table[i][0] =
                    String.valueOf(
                            ages[i]);

            if (
                    ages[i] >= 18) {

                table[i][1] =
                        "true";
            }

            else {

                table[i][1] =
                        "false";
            }
        }

        return table;
    }

    static void display(
            String[][] table) {

        System.out.println(
                "\nAge\tCan Vote");

        for (
                int i = 0;
                i < table.length;
                i++) {

            System.out.println(
                    table[i][0]
                            +
                            "\t"
                            +
                            table[i][1]);
        }
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(
                        System.in);

        int[] ages =
                inputAges(
                        10,
                        sc);

        display(
                checkVoting(
                        ages));
    }
}
