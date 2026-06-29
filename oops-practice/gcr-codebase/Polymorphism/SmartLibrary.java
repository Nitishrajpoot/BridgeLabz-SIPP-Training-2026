package Polymorphism;

package Polymorphism;

class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName,
                  String memberId) {

        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(
            int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println(
                "Name : " + memberName +
                " | ID : " + memberId);
    }
}

class StudentMember
        extends LibraryMember {

    StudentMember(String name,
                  String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 2;
    }
}

class FacultyMember
        extends LibraryMember {

    FacultyMember(String name,
                  String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 1;
    }
}

class GuestMember
        extends LibraryMember {

    GuestMember(String name,
                String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(
            int overdueDays) {

        return overdueDays * 5;
    }
}

public class SmartLibrary {

    public static void findMember(
            LibraryMember[] members,
            String searchId) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(searchId)) {

                System.out.println(
                        "\nMember Found:");
                m.printDetails();

                return;
            }
        }

        System.out.println(
                "\nMember Not Found");
    }

    public static void main(
            String[] args) {

        LibraryMember[] members = {

                new StudentMember(
                        "Nitish",
                        "S101"),

                new FacultyMember(
                        "Raj",
                        "F201"),

                new GuestMember(
                        "Aman",
                        "G301")
        };

        int overdueDays = 4;

        System.out.println(
                "Library Members:\n");

        for (LibraryMember m :
                members) {

            m.printDetails();

            System.out.println(
                    "Fine = ₹" +
                            m.calculateFine(
                                    overdueDays));

            System.out.println();
        }

        findMember(
                members,
                "F201");
    }
}