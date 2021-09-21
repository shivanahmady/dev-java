package datastructures;

import datastructures.LLNodeString;

public class MyLinkedListString {

    private LLNodeString head;

    public MyLinkedListString() {
        this.head = null;
    }

    public int length() {
        int result = 0;
        LLNodeString node = this.head;
        while (node != null) {
            result++;
            node = node.getRef();
        }
        return result;

    }

    public boolean contains(String x) {
        return search(x) != null;
    }

    public LLNodeString search(String x) {
        LLNodeString node = this.head;
        while (node != null) {
            if (node.getData().equalsIgnoreCase(x)) {
                return node;
            }
            node = node.getRef();
        }
        return node;
    }

    public void addRootNode(String d) {
        this.head = new LLNodeString(d, head);
    }

    public void deleteRootNode() {
        if (this.head != null) {
            this.head = this.head.getRef();
        } else {
            // already null
        }
    }

    @Override
    public String toString() {
        String result = "\n";
        LLNodeString node = this.head;
        int i = 0;
        while (node != null) {
            result += ("\n===|NODE|" + i + "===");
            result += ("\n---------\nDATA:\n---------\n\s\s" + node.getData()
                    + "\n--------\n\s * REF\n=|======= \n\s|\n\sV");
            node = node.getRef();
            i++;
        }
        result += "\n\sNULL\n";
        return result;
    }
}
