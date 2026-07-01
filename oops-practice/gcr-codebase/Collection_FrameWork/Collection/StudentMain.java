package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        StudentData s1 = new StudentData(101, "Nitish", 20, "CSE");
        StudentData s2 = new StudentData(102, "Rahul", 22, "CSE");
        StudentData s3 = new StudentData(103, "Neha", 26, "IT");
        StudentData s4 = new StudentData(104, "Rakulfgdhg", 25, "MECHANIC");

        ArrayList<StudentData> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
//
//        for (StudentData s : list) {
//            System.out.println(s);
//        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter naem to find data");
//        int Age=sc.nextInt();

//        for(StudentData s:list) {
//            if (s.Name.equalsIgnoreCase(name)){
//                System.out.println(s);
//            break;
//        }
//            else{
//                System.out.println("Student not found");
//            }
//       }


        StudentData max = list.get(0);

        for (StudentData s : list) {
            if (s.Name.length() > max.Name.length()) {
                max = s;
            }
        }

        System.out.println("Max length name: " + max.Name);
        System.out.println("Length: " + max.Name.length());
    }

}