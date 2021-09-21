package datastructures;

import datastructures.MyLinkedListString;
import datastructures.LLNodeString;

public class LLDemo {

    public static void main(String[] args) {
        MyLinkedListString ll = new MyLinkedListString();
        ll.addRootNode("One");
        ll.addRootNode("Two");
        ll.addRootNode("Two");
        ll.addRootNode("Two");
        ll.addRootNode("Two");

        System.out.println(ll.toString());
    }

}
