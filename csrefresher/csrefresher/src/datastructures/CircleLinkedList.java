
package datastructures;

public class CircleLinkedList {
    private CLLNode head;
    private CLLNode tail;

    public CircleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(Object x) {
        CLLNode node = new CLLNode(x);
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setRef(node);
        }
        this.tail = node;
        this.tail.setRef(head);
    }

    public boolean contains(Object x) {
        return search(x) != null;
    }

    public CLLNode search(Object x) {
        CLLNode node = this.head;
        while (node != tail) {
            if (node.getData().equals(x)) {
                return node;
            }
            node = node.getRef();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "\n\n|||<Head>";
        CLLNode node = this.head;
        while (node != tail) {
            result += ("[ " + node.getData() + " ]-*---> ");
            node = node.getRef();
        }
        result += ("[" + tail.getData() + "]<Tail>|||\n|||\t\s\s(" + tail.getRef().getData()
                + ") <--------------------------------------------*-<Tail>|||\n\n");

        return result;

    }

}
