package essentials;

public class StringMod {

    public StringMod() {
    }

    public char[] ReverseString(String text) {
        char[] arr = text.toCharArray();
        int i = 0;
        for (int ii = arr.length - 1; ii > arr.length / 2; ii--, i++) {
            char lvals = arr[i];
            arr[i] = arr[ii];
            arr[ii] = lvals;
        }
        return arr;
    }

    public char[] ReverseStringAlt(String text) {
        char[] arr = text.toCharArray();
        char[] result = new char[arr.length];
        int x = arr.length - 1;
        for (char t : arr) {
            result[x] = t;
            x--;
        }
        return arr;
    }
}
