import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable to store sum of divisors
        int sum = 0;

        // Find all proper divisors
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check if number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}
