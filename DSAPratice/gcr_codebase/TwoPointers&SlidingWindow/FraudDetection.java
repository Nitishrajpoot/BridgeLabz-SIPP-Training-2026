package TwoPointerAndSlidingWindow;



public class FraudDetection {
    public static int[] detection(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] transactions = {5000, 7000, 12000, 18000, 25000, 32000};
        int target = 37000;

        int[] ans = detection(transactions, target);

        if (ans[0] != -1) {
            System.out.println("Pair found at indices: " + ans[0] + " " + ans[1]);
            System.out.println("Values: " + transactions[ans[0]] + " " + transactions[ans[1]]);
        } else {
            System.out.println("No pair found");
        }
    }
}