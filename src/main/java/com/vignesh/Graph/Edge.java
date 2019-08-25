package com.vignesh.Graph;

public class Edge {
    int v,w;

    public Edge(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return "("+v+","+w+")";
    }
}
