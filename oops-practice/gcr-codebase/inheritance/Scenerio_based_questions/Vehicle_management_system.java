interface Refuelable{
    void reFuel();
}



class Vehicle{

    int maxSpeed;
    String model;

    Vehicle(int maxSpeed,String model)
    {
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

       void displayVehicleInfo() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }

}

class ElectricVehicle extends Vehicle implements Refuelable
{

    ElectricVehicle(int maxSpeed,String model)
    {
        super(maxSpeed, model);
    }

      @Override
      public void reFuel()
      {
        System.out.println(model+" is being charging....");
      }

}



class PetrolVehicle extends Vehicle implements Refuelable
{
      PetrolVehicle(int maxSpeed,String model)
      {
        super(maxSpeed, model);
      }

      @Override
      public void reFuel()
      {
        System.out.println(model+" is being fueled....");
      }
      
}








public class Vehicle_management_system {
    
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");

        System.out.println("Electric Vehicle");
        ev.displayVehicleInfo();
        ev.reFuel();

        System.out.println();

        PetrolVehicle pv = new PetrolVehicle(220, "Honda City");

        System.out.println("Petrol Vehicle");
        pv.displayVehicleInfo();
        pv.reFuel();
    }
}
