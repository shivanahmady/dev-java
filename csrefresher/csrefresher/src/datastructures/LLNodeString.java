package datastructures;

public class LLNodeString {
    private String data;
    private LLNodeString ref;

    public LLNodeString() {
        this.data = null;
        this.ref = null;
    }

    public LLNodeString(String s, LLNodeString r) {
        this.data = s;
        this.ref = r;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String s) {
        this.data = s;
    }

    public LLNodeString getRef() {
        return this.ref;
    }

    public void setRef(LLNodeString r) {
        this.ref = r;
    }

}
