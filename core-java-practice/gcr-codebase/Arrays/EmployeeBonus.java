import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays for 10 employees
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input details
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus and salaries
        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print report
        System.out.println("\nEmployee Salary Report");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " | Old Salary = " + salary[i] +
                " | Bonus = " + bonus[i] +
                " | New Salary = " + newSalary[i]
            );
        }

        // Final totals
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}