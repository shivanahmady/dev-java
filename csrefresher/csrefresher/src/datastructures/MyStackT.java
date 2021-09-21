package datastructures;

import java.util.ArrayList;

public class MyStackT<T> {
    static final int MAX = 1000; // MAX SIZE
    int TopIndex;
    public ArrayList<T> arr;

    public MyStackT() {
        TopIndex = -1;
        arr = new ArrayList<T>(MAX);
    }

    public boolean isEmpty() {
        if (TopIndex < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean push(T x) {
        if (TopIndex >= MAX) { // check to see if exceeding max
            return false;
        } else {
            arr.add(++TopIndex, x);
            return true;
        }
    }

    public T pop() {
        return arr.remove(TopIndex--);
    }

    public T peek() {
        if (TopIndex < 0) { // check if not empty
            return null;
        } else {
            T x = arr.get(TopIndex);
            return x;
        }
    }

    @Override
    public String toString() {
        String result = "/";
        for (T i : arr) {
            result += ("-" + i + "-");
        }
        result += "/";
        return result;
    }
}
