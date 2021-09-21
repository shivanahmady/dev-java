package essentials;

import java.util.*;

public class RotateCipher {

    // Add any helper functions you may need here
    private ArrayList<Character> cap;
    private ArrayList<Character> low;
    private ArrayList<Integer> num;

    private void populate_data() {
        cap = new ArrayList<Character>();
        low = new ArrayList<Character>();
        num = new ArrayList<Integer>();
        char c, l;
        int n;
        for (c = 'A', l = 'a', n = 0; c <= 'Z' && l <= 'z'; ++c, ++l, ++n) {
            cap.add(c);
            low.add(l);
            if (n <= 9) {
                num.add(n);
            }

        }
    }

    private char getRotatedChar(char x, int f) {
        if (this.cap.contains(x)) {
            int i = (this.cap.indexOf(x) + f) % this.cap.size();
            return this.cap.get(i);
        } else if (this.low.contains(x)) {
            int i = (this.low.indexOf(x) + f) % this.low.size();
            return this.low.get(i);
        } else if (this.num.contains(Character.getNumericValue(x))) {
            int i = (Character.getNumericValue(x) + f) % this.num.size();
            char result = (char) (i + '0');
            return result;
        } else {
            return x;
        }
    }

    String rotationalCipher(String input, int rotationFactor) {
        String result = "";
        if (input == null || rotationFactor == 0)
            return result;

        this.populate_data();

        for (int i = 0; i < input.length(); i++) {
            result += this.getRotatedChar(input.charAt(i), rotationFactor);
        }
        return result;
    }

    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;

    void check(String expected, String output) {
        boolean result = (expected.equals(output));
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printString(expected);
            System.out.print(" Your output: ");
            printString(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printString(String str) {
        System.out.print("[\"" + str + "\"]");
    }

    public void run() {
        String input_1 = "All-convoYs-9-be:Alert1.";
        int rotationFactor_1 = 4;
        String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
        String output_1 = rotationalCipher(input_1, rotationFactor_1);
        check(expected_1, output_1);

        String input_2 = "abcdZXYzxy-999.@";
        int rotationFactor_2 = 200;
        String expected_2 = "stuvRPQrpq-999.@";
        String output_2 = rotationalCipher(input_2, rotationFactor_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }

    public static void main(String[] args) {
        new RotateCipher().run();
    }
}