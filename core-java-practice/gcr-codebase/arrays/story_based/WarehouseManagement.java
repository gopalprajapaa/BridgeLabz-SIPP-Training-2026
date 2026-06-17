import java.util.Scanner;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] stock = {50, 20, 30, 40, 20, 60, 70, 30};

        // Find max, min, and total stock
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max)
                max = quantity;

            if (quantity < min)
                min = quantity;

            total += quantity;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        // Detect duplicates
        System.out.print("Duplicate Quantities: ");
        boolean found = false;

        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.print("No duplicates");
        }

        System.out.println();

        // Rotate array by k positions
        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        k = k % stock.length;

        int[] rotated = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotated[(i + k) % stock.length] = stock[i];
        }

        System.out.print("Rotated Stock Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }

        System.out.println();

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nOriginal Shelf Grid:");
        for (int[] row : shelf) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Transpose
        int[][] transpose = new int[shelf[0].length][shelf.length];

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("\nTransposed Shelf Grid:");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
