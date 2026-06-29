import java.util.*;

public class corrrect {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        int k = 0;
        
        // Read the size of the array
        int N = sc.nextInt();
        int nums[] = new int[N];
        
        // Populate the array with elements
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        
        // Read the value that needs to be removed
        int val = sc.nextInt();
        
        // Filter the array in-place
        for(int i = 0; i < N; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Print the new length of the filtered array
        System.out.println(k);
        
        // Print the elements of the modified array
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}