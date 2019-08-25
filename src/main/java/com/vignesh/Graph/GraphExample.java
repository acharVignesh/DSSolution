package com.vignesh.Graph;

import java.util.LinkedList;
import java.util.List;

public class GraphExample {
    public static void main(String[] args) {
        List<Integer> list[]=new LinkedList[10];
        for(int i=0;i<10;i++)
            list[i]=new LinkedList<Integer>();
        list[0].add(10);list[0].add(12);list[0].add(15);
        list[1].add(9);list[1].add(12);
        list[5].add(26);list[5].add(10);
        System.out.println(list[0]);
        for(int i=0;i<list.length;i++)
            System.out.println(i+"==>"+list[i]);

        System.out.println("------------");
        Graph g=new Graph(10);
        System.out.println(g);
        g.addEdge(0,2,10);
        g.addEdge(0,5,15);
        g.addEdge(2,5,10);
        g.addEdge(9,3,16);

        System.out.println(g);
        System.out.println(g.isConnected(5,16));
        System.out.println(g.isConnected(2,5));

    }
}
