public class RecursiveTemplePuzzle {

    static int moveCount = 0;

    // Tower of Hanoi
    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }

    // Recursive Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    // Recursive Reverse String
    static String reverseString(String str) {
        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Recursive Balanced Parentheses (without stack)
    static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    static boolean checkBalance(String str, int index, int count) {
        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return checkBalance(str, index + 1, count + 1);

        if (str.charAt(index) == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        System.out.println("Tower of Hanoi Solution:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves: " + moveCount);

        // Binary Search
        int[] prices = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int index = binarySearch(prices, 0, prices.length - 1, target);
        System.out.println("\nBinary Search:");
        System.out.println("Price found at index: " + index);

        // Sum of Digits
        int number = 12345;
        System.out.println("\nSum of Digits:");
        System.out.println(sumOfDigits(number));

        // Reverse String
        String message = "Temple";
        System.out.println("\nReversed String:");
        System.out.println(reverseString(message));

        // Balanced Parentheses
        String expression = "((()))()";

        System.out.println("\nBalanced Parentheses:");
        System.out.println(isBalanced(expression));
    }
}
