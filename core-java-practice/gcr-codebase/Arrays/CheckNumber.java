package Arrays;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];

        for(int i=0;i<nums.length;i++){
            System.out.print("Enter number = ");
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){

            //Number is Postive and even or odd
            if(nums[i]>0){
                if(nums[i]%2==0){
                    System.out.println(nums[i]+" is Postive number and Even number");
                }
                else{
                    System.out.println(nums[i]+" is Postive number and odd number");
                }
            }
             //number is Negative
             else if(nums[i]<0){
                   System.out.println(nums[i]+" is Negive Number");
             }
             else{
                System.out.println(nums[i]+" is Zero");
             }

        }

        //last element of Array
        int lastNum=nums.length-1;
        //compare Number
        if(nums[0]==lastNum){
            System.out.println("Numbers are equal ");
        }
        else if (nums[0]<lastNum){
           System.out.println("first number is less than last number");
        }
        else{
            System.out.println("first number is greater than last number");
        }
        sc.close();
    }
}
