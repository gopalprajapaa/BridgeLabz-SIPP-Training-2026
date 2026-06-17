
class MathWizard {

    // Instance Variable
    int number = 100;

    // Prime Check
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial for int
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded Factorial for double
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci Series
    public void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // GCD
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demonstration
    public void showScope() {
        int number = 50; // Local Variable

        System.out.println("Local Variable: " + number);
        System.out.println("Instance Variable: " + this.number);
    }
}

public class MathWizardDemo {
    public static void main(String[] args) {

        MathWizard wizard = new MathWizard();

        System.out.println("Is 17 Prime? " + wizard.isPrime(17));

        System.out.println("Factorial(5): " + wizard.factorial(5));

        System.out.println("Factorial(5.0): " + wizard.factorial(5.0));

        wizard.fibonacci(10);

        System.out.println("GCD(24,36): " + wizard.gcd(24, 36));

        System.out.println("LCM(24,36): " + wizard.lcm(24, 36));

        System.out.println("2^5 = " + wizard.power(2, 5));

        System.out.println("\nScope Demonstration:");
        wizard.showScope();
    }
}
