package algorithms;

import java.util.Stack;

public class demo {

    public static boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here
        Stack<Integer> s = new Stack<Integer>();
        int i = 0, x = 0;
        for (; i < array_a.length && x < array_b.length;) {

            if (array_a[i] == array_b[x]) {
                if (!s.isEmpty()) {
                    if (s.peek() == array_a[i]) {
                        int p = s.pop();
                    }
                    x--;
                    i++;
                } else {
                    x++;
                    i++;
                }
            } else {
                s.push(array_b[x]);
                x++;
            }
        }

        if (s.isEmpty())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int[] a = { 12, 22, 3, 4 };
        // int[] b = { 1, 4, 3, 2 };
        // System.out.println(areTheyEqual(a, b));
        QS.quicksort(a);
        for (int x : a) {
            System.out.print("[" + x + "]");
        }

    }
}
