class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1.0;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

public class Main {

    static void findMemberById(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(id)) {
                System.out.println("\nMember Found");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nMember with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Gopal", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Amit", "G301")
        };

        int overdueDays = 6;

        System.out.println("===== Library Members =====\n");

        for (LibraryMember member : members) {

            member.printDetails();

            // Dynamic Method Dispatch
            System.out.println("Fine for " + overdueDays + " overdue days : ₹"
                    + member.calculateFine(overdueDays));

            System.out.println("----------------------------");
        }

        findMemberById(members, "F201");
    }
}