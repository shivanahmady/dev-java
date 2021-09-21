package datastruct;

class GenericStack<T> {
    static final int MAX = 1000; // MAX SIZE
    int TopIndex;
    T[] arr;

    GenericStack() {
        TopIndex = -1;
        arr = new T[MAX];
    }

    boolean isEmpty() {
        if (TopIndex < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean push(T x) {
        if (TopIndex >= MAX) { // check to see if exceeding max
            return false;
        } else {
            arr[++TopIndex] = x;
            return true;
        }
    }

    T pop() {
        return arr[TopIndex--];
    }

    T peek() {
        if (TopIndex < 0) { // check if not empty
            return -1;
        } else {
            T x = arr[TopIndex];
            return x;
        }
    }

}
