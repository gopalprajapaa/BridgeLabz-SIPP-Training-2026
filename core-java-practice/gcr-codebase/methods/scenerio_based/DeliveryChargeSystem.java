import java.util.Scanner;

public class DeliveryChargeSystem {

    // Distance only
    public static double calculateCharge(int distance) {

        return distance * 5;
    }

    // Distance + Weight
    public static double calculateCharge(int distance,
                                         int weight) {

        return (distance * 5) + (weight * 10);
    }

    // Distance + Weight + Express Delivery
    public static double calculateCharge(int distance,
                                         int weight,
                                         boolean expressDelivery) {

        double charge =
                (distance * 5) + (weight * 10);

        if (expressDelivery) {
            charge += 100;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        int weight = sc.nextInt();

        System.out.print("Express Delivery (true/false): ");
        boolean express = sc.nextBoolean();

        System.out.println("\n----- Delivery Charges -----");

        System.out.println(
                "Distance Only: ₹" +
                calculateCharge(distance));

        System.out.println(
                "Distance + Weight: ₹" +
                calculateCharge(distance, weight));

        System.out.println(
                "Distance + Weight + Express: ₹" +
                calculateCharge(distance,
                                weight,
                                express));

        sc.close();
    }
}
