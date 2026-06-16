public class NumberChecker {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {

        int count = countDigits(number);

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {

            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {

            if (digit == 0)
                return true;
        }

        return false;
    }

    public static boolean isArmstrong(int number) {

        int[] digits = getDigits(number);

        int power = digits.length;

        int sum = 0;

        for (int digit : digits) {

            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    public static boolean isPalindrome(int number) {

        int[] digits = getDigits(number);

        int start = 0;
        int end = digits.length - 1;

        while (start < end) {

            if (digits[start] != digits[end])
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {

            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    public static boolean isSpy(int number) {

        int sum = 0;
        int product = 1;

        while (number > 0) {

            int digit = number % 10;

            sum += digit;
            product *= digit;

            number /= 10;
        }

        return sum == product;
    }

    public static boolean isAutomorphic(int number) {

        int square = number * number;

        return String.valueOf(square)
                .endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {

        return number % 7 == 0
                || number % 10 == 7;
    }

    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0)
                sum += i;
        }

        return sum == number;
    }

    public static boolean isAbundant(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0)
                sum += i;
        }

        return sum > number;
    }

    public static boolean isDeficient(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0)
                sum += i;
        }

        return sum < number;
    }

    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int number) {

        int original = number;

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            sum += factorial(digit);

            number /= 10;
        }

        return sum == original;
    }
}
