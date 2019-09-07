package com.vignesh.Tree;

public class BinaryTree {
    private Node root;

    public void  printPreOrder(){

    }
    private void inserElemet(int key){
       root=addRecursive(root,key);
    }

    private Node addRecursive(Node currentNode,int value){
        if(currentNode==null){
            currentNode=new Node(value);
            return currentNode;
        }
        if(value<currentNode.getData()) {
            currentNode.setLeft(addRecursive(currentNode.getLeft(), value));
        }else if(value>currentNode.getData()){
            currentNode.setRight(addRecursive(currentNode.getLeft(), value));
        }else {
            return currentNode;
        }
        return currentNode;
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.inserElemet(10);
        bt.inserElemet(2);
        bt.inserElemet(4);
        bt.inserElemet(1);
        bt.inserElemet(6);
        bt.inserElemet(3);
        System.out.printf(bt.toString());
        bt.printRecurive(bt.root);
    }
    private void printRecurive(Node node){
        if(node.getLeft()==null||node.getRight()==null){
            System.out.println(node.getData());
        }else  if(node.getLeft()!=null){
            printRecurive(node.getLeft());
        }else if(node.getRight()!=null){
            printRecurive(node.getRight());
        }
    }

}
