package sort;

public class CocktailSort {

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            right--;
            for (int i = right - 1; i >= left; i--) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            left++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
