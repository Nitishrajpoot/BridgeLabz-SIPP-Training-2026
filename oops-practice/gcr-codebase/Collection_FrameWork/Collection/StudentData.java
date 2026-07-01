package Collection;

public class StudentData {

    int Id;
    String Name;
    int Age;
    String Branch;

    public StudentData(int id, String name, int age, String branch) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Branch = branch;
    }

    @Override
    public String toString() {
        return "__________________________________________\n" +
                "ID: " + Id +
                "\nName: " + Name +
                "\nAge: " + Age +
                "\nBranch: " + Branch;
    }
}