package tumpukan;

public class node {
    protected Integer dataNode;
    protected node ptr;

    public node() {
        dataNode = null;
        ptr = null;
    }

    public node(Integer d, node e) {
        dataNode = d;
        ptr = e;
    }

    public void setData(Integer d) {
        dataNode = d;
    }

    public void setPtr(node e) {
        ptr = e;
    }

    public Integer getData() {
        return dataNode;
    }

    public node getPtr() {
        return ptr;
    }
}
