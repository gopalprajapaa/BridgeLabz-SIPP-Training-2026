import java.util.*;

public class CustomerOrders {

    public static void mergeSort(int arr[], int left, int right) {

        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int arr[], int left, int mid, int right) {

        int leftArray[] = Arrays.copyOfRange(arr, left, mid + 1);
        int rightArray[] = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j])
                arr[k++] = leftArray[i++];
            else
                arr[k++] = rightArray[j++];
        }

        while (i < leftArray.length)
            arr[k++] = leftArray[i++];

        while (j < rightArray.length)
            arr[k++] = rightArray[j++];
    }

    public static void main(String args[]) {

        int orders[] = {850, 420, 1200, 650, 300};

        mergeSort(orders, 0, orders.length - 1);

        System.out.println(Arrays.toString(orders));
    }
}
