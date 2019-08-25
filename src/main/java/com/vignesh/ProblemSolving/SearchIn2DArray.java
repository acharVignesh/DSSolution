package com.vignesh.ProblemSolving;

public class SearchIn2DArray {
    public static void  search(int[][] a,int size,int searchElement){
        int i=0;int j=size-1; int loopCount=1;
        while(i<size&&j>=0){
            loopCount++;
            if(a[i][j]==searchElement){
                System.out.println("Found  a position "+i+","+j);
                break;
            }else if(a[i][j]>searchElement){
                j--;
            }else if(a[i][j]<searchElement){
                i++;
            }

        }
        System.out.println("Loop Count:"+loopCount);
    }

    public static void main(String[] args) {
        int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };

        search(mat, 4, 32);
    }
}
