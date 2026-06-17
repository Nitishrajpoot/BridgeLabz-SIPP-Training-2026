public class Ravi {

    String name;
    int age;
    String rank;
    double salary;
    float fees;

    // Constructor
    public Ravi(String name, int age, String rank,
                double salary, float fees) {

        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.fees = fees;
    }

    // Method to calculate bonus
    public int calculateBonus() {
        return (int)(salary * 0.12);
    }

    // Method to print welcome card
    public void display() {

        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + fees);
        System.out.println("Annual Bonus   : " + calculateBonus());
        System.out.println("========================");
    }

    public static void main(String[] args) {

        Ravi r = new Ravi(
                "Ram",
                20,
                "Intern",
                12323344.33,
                13232f
        );

        r.display();
    }
}