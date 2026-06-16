
import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Smart Card Balance: ₹");
        double balance = sc.nextDouble();

        while (balance > 0) {

            System.out.print("\nEnter Distance Travelled (km): ");
            double distance = sc.nextDouble();

            double fare = (distance <= 5) ? 20 :
                          (distance <= 15) ? 40 : 60;

            if (balance < fare) {
                System.out.println("Insufficient Balance!");
                break;
            }

            balance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);

            System.out.print("Continue Journey? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Thank you for using Delhi Metro.");
        sc.close();
    }
}
