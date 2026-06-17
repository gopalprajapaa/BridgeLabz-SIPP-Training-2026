public class WelcomeCard {
    public static void main(String[] args) {
        
        // Storing details
        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 50000.0;
        float membershipFee = 1500.50f;

        // Calculating annual bonus (12% of salary)
        int annualBonus = (int) (salary * 0.12);

        // Printing welcome card
        System.out.println("=================================");
        System.out.println("      CODING GUILD WELCOME");
        System.out.println("=================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("=================================");
        System.out.println("Welcome to the Coding Guild!");
        System.out.println("=================================");
    }
}