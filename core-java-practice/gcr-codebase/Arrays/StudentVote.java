package Arrays;

import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter your age= ");
            arr[i]=sc.nextInt();
           
            if(arr[i]>=18){
                System.out.println("The Student with the age "+arr[i]+" can vote");

            }
            else if(arr[i]<0){
                System.out.println("Invaild Age");
            }
            else{
                System.out.println("The student with the age "+arr[i]+" cannot vote");
            }
             System.out.println("------------------------------");
        }
        sc.close();


    }
}
