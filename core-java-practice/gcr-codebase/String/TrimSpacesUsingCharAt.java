package String;

import java.util.Scanner;

public class TrimSpacesUsingCharAt {

    static int[] findIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length()
                && text.charAt(start) == ' ') {

            start++;
        }

        while (end >= 0
                && text.charAt(end) == ' ') {

            end--;
        }

        return new int[]{
                start,
                end
        };
    }

    static String createSubstring(
            String text,
            int start,
            int end) {

        String result = "";

        for (
                int i = start;
                i <= end;
                i++) {

            result += text.charAt(i);
        }

        return result;
    }

    static boolean compare(
            String a,
            String b) {

        if (
                a.length()
                        !=
                        b.length()) {

            return false;
        }

        for (
                int i = 0;
                i < a.length();
                i++) {

            if (
                    a.charAt(i)
                            !=
                            b.charAt(i)) {

                return false;
            }
        }

        return true;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(
                        System.in);

        System.out.print(
                "Enter Text: ");

        String text =
                sc.nextLine();

        int[] indexes =
                findIndexes(text);

        String custom =
                createSubstring(
                        text,
                        indexes[0],
                        indexes[1]);

        String builtin =
                text.trim();

        System.out.println(
                "Custom Trim = "
                        +
                        custom);

        System.out.println(
                "Built-in Trim = "
                        +
                        builtin);

        System.out.println(
                "Same = "
                        +
                        compare(
                                custom,
                                builtin));
    }
}
