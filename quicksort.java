package sorting;
import java.util.Arrays;

public class quicksort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    
    public static void main(String[] args) {
        int[] array = {8, 7, 2, 1, 0, 9, 6};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(array));
    }
}
