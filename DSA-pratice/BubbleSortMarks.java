import java.util.*;

public class BubbleSortMarks {

    public static void bubbleSort(int arr[]) {

        int swaps = 0;
        boolean sorted;

        for (int i = 0; i < arr.length - 1; i++) {

            sorted = true;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    sorted = false;
                }
            }

            if (sorted)
                break;
        }

        System.out.println("Sorted Marks:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Total Swaps = " + swaps);
    }

    public static void main(String args[]) {

        int marks[] = {65, 88, 34, 90, 78};

        bubbleSort(marks);
    }
}
