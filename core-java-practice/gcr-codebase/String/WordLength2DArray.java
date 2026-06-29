package String;

import java.util.Scanner;

public class WordLength2DArray {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[] splitWords(String text) {

        return text.split(" ");
    }

    static String[][] createTable(String[] words) {

        String[][] table =
                new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            table[i][0] = words[i];

            table[i][1] =
                    String.valueOf(
                            findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result =
                createTable(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] +
                    "\t" +
                    Integer.parseInt(result[i][1]));
        }
    }
}
