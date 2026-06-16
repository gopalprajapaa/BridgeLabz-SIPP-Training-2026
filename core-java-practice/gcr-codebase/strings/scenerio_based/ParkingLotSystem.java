import java.util.Scanner;

public class ParkingLotSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 10;
        int occupied = 0;
        int choice;

        while (true) {

            if (occupied == capacity) {
                System.out.println("\nParking Lot Full!");
            }

            System.out.println("\n===== Parking Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle Parked Successfully.");
                    } else {
                        System.out.println("No Space Available.");
                    }
                    break;

                case 2:

                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle Exited Successfully.");
                    } else {
                        System.out.println("Parking Lot Empty.");
                    }
                    break;

                case 3:

                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (capacity - occupied));
                    break;

                case 4:

                    System.out.println("System Closed.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
