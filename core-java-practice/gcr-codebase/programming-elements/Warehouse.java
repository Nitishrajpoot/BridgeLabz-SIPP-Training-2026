import java.util.HashSet;

public class Warehouse {

    // Rotate array by k positions
    static void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Transpose matrix
    static void transpose(int[][] shelf) {

        int rows = shelf.length;
        int cols = shelf[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = shelf[i][j];
            }
        }

        System.out.println("\nTransposed Shelf:");

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {40, 20, 50, 20, 60, 70, 50};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Find max min total duplicate
        for (int value : stock) {

            if (value > max)
                max = value;

            if (value < min)
                min = value;

            total += value;

            if (!set.add(value))
                duplicates.add(value);
        }

        System.out.println("Max Stock : " + max);
        System.out.println("Min Stock : " + min);
        System.out.println("Total Stock : " + total);

        System.out.println("Duplicates : " + duplicates);

        // Rotate
        int k = 2;

        rotate(stock, k);

        System.out.print("\nAfter Rotation: ");

        for (int value : stock)
            System.out.print(value + " ");


        // Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transpose(shelf);
    }
}