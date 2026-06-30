import java.util.*;
public class Smart_Parking
{
   List<String> vehicles=new ArrayList<>();

   void addVehicle(String regno)
   {
       if(vehicles.contains(regno))
       {
        System.out.println("It is already Parked");
       }
       else{
         vehicles.add(regno);
         System.out.println("your vehicle enter successfully");
       }
   }

   void removeVehicle(String regno)
   {
      if(vehicles.contains(regno))
      {
        vehicles.remove(regno);
        System.out.println("your vehicle exit successfully");
      }
      else
      {
        System.out.println("your vehicle is not found");
      }
   }

   void searchVehicle(String regno)
   {
      if(vehicles.contains(regno))
      {
         System.out.println("your vehicle is currently parked");
      }
      else
      {
        System.out.println("your vehicle is not found");
      }
   }


   void displayVehicles()
   {
      if(vehicles.isEmpty())
      {
        System.out.println("Parking is Empty");
      }
      else
      {
        System.out.println("the following parked vehicles are:  ");
        for(String vehicle:vehicles)
        {
            System.out.println(vehicle);
        }

        System.out.println("the total no. of parked vehicles are: "+vehicles.size());
      }
   }


   public static void main(String args[])
   {
         Scanner sc = new Scanner(System.in);
        Smart_Parking parking = new Smart_Parking();

        while (true) {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String entry = sc.nextLine();
                    parking.addVehicle(entry);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String exit = sc.nextLine();
                    parking.removeVehicle(exit);
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String search = sc.nextLine();
                    parking.searchVehicle(search);
                    break;

                case 4:
                    parking.displayVehicles();
                    break;

                case 5:
                    System.out.println("Thank you for using Smart Parking Slot Manager.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
       
}
