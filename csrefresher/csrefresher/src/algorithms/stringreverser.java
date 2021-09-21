import java.util.Scanner;

public class stringreverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        System.out.println("----------");

        /***
         * INEFFICIENT Adds an extra array, then loops the first array in reverse to
         * populate the added array
         */

        char[] result = new char[arr.length];
        int x = arr.length - 1;
        for (char t : arr) {
            result[x] = t;
            x--;
        }
        System.out.println(result);

        /***
         * N/2 Only 1 extra char variable used
         */

        int i = 0;
        for (int ii = arr.length - 1; ii > arr.length / 2; ii--, i++) {
            char lvals = arr[i];
            arr[i] = arr[ii];
            arr[ii] = lvals;
        }
        System.out.println(arr);

        /***
         * STRING BUILDER
         */

        String temp = new StringBuilder("hi").reverse().toString();
        System.out.println(temp);
    }
}
