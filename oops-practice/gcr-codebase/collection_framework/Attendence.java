import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class SmartClassroomAttendanceTracker {

    private HashMap<String, ArrayList<String>> attendance;

    public SmartClassroomAttendanceTracker() {
        attendance = new HashMap<>();
    }

    // Mark attendance
    public void markAttendance(String subject, String student) {

        // Create subject if it doesn't exist
        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        // Check for duplicate attendance
        if (students.contains(student)) {
            System.out.println(student + " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    // Display attendance of all subjects
    public void displayAttendance() {
        System.out.println("\nAttendance Report:");

        for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {

            System.out.println("\nSubject: " + entry.getKey());

            for (String student : entry.getValue()) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + entry.getValue().size());
        }
    }
}

public class Attendence {
    public static void main(String[] args) {

        SmartClassroomAttendanceTracker tracker = new SmartClassroomAttendanceTracker();

        // Mark attendance
        tracker.markAttendance("Java", "Gopal");
        tracker.markAttendance("Java", "Rahul");
        tracker.markAttendance("Java", "Gopal");     // Duplicate

        tracker.markAttendance("Python", "Aman");
        tracker.markAttendance("Python", "Gopal");
        tracker.markAttendance("Python", "Aman");    // Duplicate

        tracker.markAttendance("DBMS", "Priya");
        tracker.markAttendance("DBMS", "Rahul");

        // Display attendance
        tracker.displayAttendance();
    }
}