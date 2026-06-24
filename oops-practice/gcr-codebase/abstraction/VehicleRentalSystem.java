abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Setters
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Concrete method
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }

    // Abstract method
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(2000);

        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE101");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK101");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(1000);

        int days = 5;

        System.out.println("Car Details");
        car.displayVehicleDetails();
        System.out.println("Rental Cost : " + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("Bike Details");
        bike.displayVehicleDetails();
        System.out.println("Rental Cost : " + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("Truck Details");
        truck.displayVehicleDetails();
        System.out.println("Rental Cost : " + truck.calculateRentalCost(days));
    }
}
