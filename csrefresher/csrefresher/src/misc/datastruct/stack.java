package datastruct;

class stack {

    static final int MAX = 1000; // MAX SIZE
    int TopIndex;
    int[] arr;

    stack() {
        TopIndex = -1;
        arr = new int[MAX];
    }

    boolean isEmpty() {
        if (TopIndex < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean push(int x) {
        if (TopIndex >= MAX) { // check to see if exceeding max
            return false;
        } else {
            arr[++TopIndex] = x;
            return true;
        }
    }

    int pop() {
        return arr[TopIndex--];
    }

    int peek() {
        if (TopIndex < 0) { // check if not empty
            return -1;
        } else {
            int x = arr[TopIndex];
            return x;
        }
    }

}

// class Main {
// public static void main(String args[]) {
// stack s = new stack();
// System.out.println(s.isEmpty() + "EMPTY");
// s.push(10);
// System.out.println(s.peek() + "--peek");
// s.push(20);
// System.out.println(s.peek() + "--peek");
// s.push(30);
// System.out.println(s.pop() + "Popped from stack");
// System.out.println(s.pop() + " Popped from stack");
// System.out.println(s.peek() + "--peek");

// }
// }