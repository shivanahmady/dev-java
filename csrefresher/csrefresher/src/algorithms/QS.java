package algorithms;

public class QS {

    public static void quicksort(int[] arr) {
        // nlogn - avg
        // n^2 - worst

        quicksort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int pivot = arr[(left + right) / 2];

        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index - 1);
        quicksort(arr, index, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
