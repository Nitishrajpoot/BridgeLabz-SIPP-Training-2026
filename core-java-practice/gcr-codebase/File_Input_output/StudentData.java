package file_input_output;

import java.util.Scanner;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentData {
    int ID;
    String name;
    int marks;

    // Constructor
    public StudentData(int ID, String name, int marks) {
        this.ID = ID;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Marks: " + marks;
    }

    // Method to take input and save to file
    public void addStudentData() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            int marks = sc.nextInt();

            // Create student object
            StudentData student = new StudentData(id, name, marks);

            // Write to file in append mode
            FileWriter writer = new FileWriter("studentdata.txt", true);
            writer.write("ID"+id+"Name"+name+"Marks"+marks+"\n");
            writer.close();

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
        // Don't close System.in Scanner if you may reuse it later.
    }


 public void searchByName() {
    try {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("studentdata.txt"));

        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {

            String[] student = line.split(",");

            if (student[1].equalsIgnoreCase(name)) {

                System.out.println("ID: " + student[0]);
                System.out.println("Name: " + student[1]);
                System.out.println("Marks: " + student[2]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        reader.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // Main method
    public static void main(String[] args) {
        StudentData student = new StudentData(0, "", 0);
        student.addStudentData();
        student.searchByName();
        student.searchByName();
        
    }
}

