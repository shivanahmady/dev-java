package essentials;

import java.util.List;

public class ArrayMod {

    // Time complexity: O(N * D)
    // Auxiliary Space: O(1)

    public void RotateArrayLeft(int[] arr, int size, int d) {
        for (int i = 0; i < d; i++) {
            RotateArrayLeftByOne(arr, size);
        }

    }

    public void RotateArrayLeftByOne(int[] arr, int size) {
        int temp = arr[0], i = 0;
        for (; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    public String toString(int[] arr, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += (arr[i] + " ");
        return result;
    }

    // OPTION 1 :
    // Time complexity: O(N * D)
    // Auxiliary Space: O(1)

    public static List<Integer> RotateLeftByOne(List<Integer> a) {
        int i = 0, temp = a.get(0);
        for (; i < a.size() - 1; i++) {
            a.set(i, a.get(i + 1));
        }
        a.set(i, temp);
        return a;
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        for (int i = 0; i < d; i++) {
            RotateLeftByOne(a);
        }
        return a;
    }

    public static void main(String[] args) {
        ArrayMod rotate = new ArrayMod();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.RotateArrayLeft(arr, arr.length, 8);
        System.out.println(rotate.toString(arr, arr.length));
    }

}
