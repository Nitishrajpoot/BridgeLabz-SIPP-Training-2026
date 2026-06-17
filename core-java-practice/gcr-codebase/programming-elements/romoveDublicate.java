package programmingElement;




public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 8, 7};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                   j--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

