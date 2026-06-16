import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class CalendarDisplay {

    public static void displayCalendar(int month, int year) {

        YearMonth yearMonth = YearMonth.of(year, month);

        int daysInMonth = yearMonth.lengthOfMonth();

        LocalDate firstDay = yearMonth.atDay(1);

        int dayOfWeek = firstDay.getDayOfWeek().getValue();
        // Monday=1, Tuesday=2, ..., Sunday=7

        System.out.println("\n     " + yearMonth.getMonth() + " " + year);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {

            System.out.printf("%3d ", day);

            if ((day + dayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month!");
            return;
        }

        displayCalendar(month, year);

        sc.close();
    }
}
