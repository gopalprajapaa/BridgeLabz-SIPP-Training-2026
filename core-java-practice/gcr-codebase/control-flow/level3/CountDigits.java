import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store count of digits
        int count = 0;

        // Special case for 0
        if (number == 0) {
            count = 1;
        } else {

            // Convert negative number to positive
            if (number < 0) {
                number = -number;
            }

            // Count digits
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;             // Increase count
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}