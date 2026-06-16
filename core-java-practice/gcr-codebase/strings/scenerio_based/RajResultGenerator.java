import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter Marks of 5 Subjects:");

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];
        }

        double average = total / 5.0;

        int gradeCode;

        if (average >= 90)
            gradeCode = 1;
        else if (average >= 80)
            gradeCode = 2;
        else if (average >= 70)
            gradeCode = 3;
        else if (average >= 60)
            gradeCode = 4;
        else
            gradeCode = 5;

        System.out.println("\nAverage Marks: " + average);

        switch (gradeCode) {

            case 1:
                System.out.println("Grade: A");
                break;

            case 2:
                System.out.println("Grade: B");
                break;

            case 3:
                System.out.println("Grade: C");
                break;

            case 4:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

        sc.close();
    }
}