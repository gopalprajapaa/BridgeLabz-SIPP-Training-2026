class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double paymentAmount)
            throws InsufficientFundsException {

        if (paymentAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed! Required: ₹" + billAmount +
                    ", Available: ₹" + paymentAmount);
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;

            System.out.println("Cost Per Item: " + (totalBill / items));

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            String[] patients = {"Ravi", "Amit", "Neha"};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "abc";

            int amount = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
