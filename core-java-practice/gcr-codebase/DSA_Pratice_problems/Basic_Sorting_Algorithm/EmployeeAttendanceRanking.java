package BasicSortingAlgo;

import java.util.*;

public class EmployeeAttendanceRanking {

    static class Employee {
        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        for(int i = 0; i < n; i++)
            employeeIds[i] = sc.nextInt();

        for(int i = 0; i < n; i++)
            attendance[i] = sc.nextInt();

        int k = sc.nextInt();

        Employee[] emp = new Employee[n];

        for(int i = 0; i < n; i++)
            emp[i] = new Employee(employeeIds[i], attendance[i]);

        Arrays.sort(emp, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                if(a.attendance != b.attendance)
                    return b.attendance - a.attendance;
                return a.id - b.id;
            }
        });

        for(int i = 0; i < k; i++)
            System.out.print(emp[i].id + " ");
    }
}