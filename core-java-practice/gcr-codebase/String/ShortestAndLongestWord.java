package String;

import java.util.Scanner;

public class ShortestAndLongestWord {

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

    static String[][] createWordTable(String[] words) {

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

    static int[] findShortestLongest(
            String[][] table) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < table.length; i++) {

            int len =
                    Integer.parseInt(
                            table[i][1]);

            if (len <
                    Integer.parseInt(
                            table[shortest][1])) {

                shortest = i;
            }

            if (len >
                    Integer.parseInt(
                            table[longest][1])) {

                longest = i;
            }
        }

        return new int[]{
                shortest,
                longest
        };
    }

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter Text: ");

        String text =
                sc.nextLine();

        String[] words =
                splitWords(text);

        String[][] table =
                createWordTable(words);

        int[] result =
                findShortestLongest(table);

        System.out.println(
                "Shortest: "
                        +
                        table[result[0]][0]);

        System.out.println(
                "Longest: "
                        +
                        table[result[1]][0]);

            sc.close();
    }
}
