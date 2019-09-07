package com.vignesh.Tree;

public class NodeString {
    private String data;
    private NodeString left,right;

    NodeString(String data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "NodeString{" +
                "data='" + data + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeString getLeft() {
        return left;
    }

    public void setLeft(NodeString left) {
        this.left = left;
    }

    public NodeString getRight() {
        return right;
    }

    public void setRight(NodeString right) {
        this.right = right;
    }
}
