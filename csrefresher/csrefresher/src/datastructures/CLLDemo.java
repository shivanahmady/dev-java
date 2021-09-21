package datastructures;

public class CLLDemo {

    public static void main(String[] args) {
        CircleLinkedList cll = new CircleLinkedList();

        cll.insertNode(13);
        cll.insertNode(7);
        cll.insertNode(24);
        cll.insertNode(1);
        cll.insertNode(8);
        cll.insertNode(7);
        cll.insertNode(24);
        cll.insertNode(1);
        cll.insertNode(8);

        System.out.println(cll.toString());
    }

}
