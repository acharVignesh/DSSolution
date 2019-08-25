package com.vignesh.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<Edge> G[];

    public Graph(int n) {
        G = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new LinkedList<Edge>();
        }
    }
    public void addEdge(int u,int v,int w){
        G[u].add(new Edge(v,w));
    }
    public boolean isConnected(int u,int v){
        for(Edge i:G[u]){
            if(i.v==v){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < G.length; i++) {
            result += i + "=>" + G[i] + "\n";
        }
        return result;
    }
}
