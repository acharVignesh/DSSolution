package com.vignesh.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    private Node root;

    private Node addRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            currentNode = new Node(value);
            return currentNode;
        }
        if (value < currentNode.getData()) {
            currentNode.setLeft(addRecursive(currentNode.getLeft(), value));
        } else if (value > currentNode.getData()) {
            currentNode.setRight(addRecursive(currentNode.getRight(), value));
        } else {
            return currentNode;
        }
        return currentNode;
    }

    private void inserElemet(int key) {
        root = addRecursive(root, key);
    }

    public static void main(String[] args) {
        TreeTraversal myTree = new TreeTraversal();
        myTree.inserElemet(5);
        myTree.inserElemet(3);
        myTree.inserElemet(7);
        myTree.inserElemet(4);
        myTree.inserElemet(6);
        myTree.inserElemet(2);
        myTree.inserElemet(1);
        myTree.inserElemet(8);
        levelOrderTraversal(myTree.root);
        System.out.println("--------------------");
        levelOrderTraversalLevelBylevel(myTree.root);
    }

    private static void levelOrderTraversal(Node node) {
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(node);

        while (!myQueue.isEmpty()) {
            Node currentNode = myQueue.remove();
            System.out.println(currentNode.getData());
            if (currentNode.getLeft() != null) {
                myQueue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                myQueue.add(currentNode.getRight());
            }

        }
    }

    private static void levelOrderTraversalLevelBylevel(Node node) {
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(node);
        myQueue.add(null);

        while (!myQueue.isEmpty()) {
            Node currentNode = myQueue.remove();
            if (currentNode != null) {
                System.out.print(currentNode.getData() + "  ");
            }
            if (currentNode != null) {
                if (currentNode.getLeft() != null) {
                    myQueue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    myQueue.add(currentNode.getRight());
                }
            }
            if (currentNode == null) {
                System.out.println();
                if (myQueue.peek() != null) {
                    myQueue.add(null);
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
