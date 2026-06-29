package Inheritance.java;


class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nAge : " + age;
    }
}


class Student extends Person {

    final String studentId;
    double gpa;

    Student(String name,
            int age,
            String studentId,
            double gpa) {

        super(name, age);

        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nStudent ID : " + studentId +
                "\nGPA : " + gpa;
    }
}


class GradStudent extends Student {

    String thesis;

    GradStudent(String name,
                int age,
                String studentId,
                double gpa,
                String thesis) {

        super(name, age, studentId, gpa);

        this.thesis = thesis;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nThesis : " + thesis;
    }
}


public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent student =
                new GradStudent(
                        "Nitish",
                        23,
                        "ST101",
                        8.9,
                        "Machine Learning"
                );

        System.out.println("Student Details:\n");

        System.out.println(student);


        System.out.println("\nIS-A Relationship");

        System.out.println(
                "GradStudent IS-A Student : "
                        + (student instanceof Student));

        System.out.println(
                "GradStudent IS-A Person : "
                        + (student instanceof Person));
    }
}