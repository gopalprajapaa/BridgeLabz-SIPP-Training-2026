import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (m): ");
        double height = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f\n", bmi);

        // Determine BMI Category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Category: Normal Weight");
        }
        else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}
