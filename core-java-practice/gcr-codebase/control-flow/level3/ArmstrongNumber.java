import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store original number
        int originalNumber = number;

        // Initialize sum to 0
        int sum = 0;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Extract last digit
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check if Armstrong Number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}