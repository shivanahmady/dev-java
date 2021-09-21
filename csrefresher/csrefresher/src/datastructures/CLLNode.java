package datastructures;

public class CLLNode {

    private Object data;
    private CLLNode ref;

    public CLLNode() {
        this.data = null;
        this.ref = null;
    }

    public CLLNode(Object d) {
        this.data = d;
        this.ref = null;
    }

    public void setData(Object d) {
        this.data = d;
    }

    public Object getData() {
        return this.data;
    }

    public void setRef(CLLNode n) {
        this.ref = n;
    }

    public CLLNode getRef() {
        return this.ref;
    }

}
