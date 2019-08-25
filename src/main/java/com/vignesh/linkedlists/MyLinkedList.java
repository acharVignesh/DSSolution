package com.vignesh.linkedlists;

public class MyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        linkedList.head.next = second;

        second.next = third;
        third.next = fourth;
        linkedList.deleteElement(1);
        linkedList.printList();

        linkedList.push(10);
        linkedList.push(15);
        linkedList.push(9);
        linkedList.pop();
        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();
        linkedList.deleteElementByPosistion(4);
        linkedList.printList();
        System.out.println("Lenth:" + linkedList.length());
        System.out.println("Lenth By Recursion:" + linkedList.lengthByRecursion());
        linkedList.middleOfList();

        linkedList.sort();
        System.out.println("Sorted List");
        linkedList.printList();

        for (int i = 0; i < 5; i++) {
            linkedList.pop();
        }

        linkedList.printList();

    }

    public void deleteElement(int element) {
        Node currentNode = head;
        if (currentNode.data == element) {
            head = head.next;
        } else {
            Node previousNode = null;
            while (currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                if (currentNode.data == element) {
                    previousNode.next = currentNode.next;
                    break;
                }
            }
        }
    }

    public void deleteElementByPosistion(int position) {
        int index = 1;
        if (position == 0) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            if (currentNode == null) {
                System.out.println("Index Out of bound exception");
                return;
            }
            if (position == index) {
                previousNode.next = currentNode.next;
                return;
            }
            index++;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node traverse = head;
        while (traverse != null) {
            System.out.print(traverse.data);
            if (traverse.next != null) {
                System.out.print(",");
            }
            traverse = traverse.next;

        }
        System.out.println();
    }

    public void push(int key) {
        Node previousHead = head;
        head = new Node(key);
        head.next = previousHead;
    }

    public void pop() {
        if (head != null) {
            System.out.println(head.data);
            head = head.next;
            if (head == null) {
                System.out.println("Linked List Is Cleared");
            }
        } else {
            System.out.println("Linked List Is Empty");
        }
    }

    public int length() {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public int lengthByRecursion() {
        return getCount(head);
    }

    public int getCount(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + getCount(node.next);
        }
    }
    public void  reverse(){
        Node current=head;
        Node prevNode=null;
        Node nextNode=null;
        while (current!=null){

            nextNode=current.next;

            current.next=prevNode;
            prevNode=current;
            current=nextNode;
        }
        head=prevNode;
    }
    public void middleOfList(){
        Node slowPointer=head;
        Node fastPointer=head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
        }
        System.out.println("Middle of list is:"+slowPointer.data);
    }
    public void  sort(){
        Node current=head;
        while (current!=null){
            Node compareNodes=current.next;
            while(compareNodes!=null)
            {
                if(current.data>compareNodes.data){
                    int swap = compareNodes.data;
                    compareNodes.data=current.data;
                    current.data=swap;
                }
                compareNodes=compareNodes.next;
            }
            current=current.next;

        }
    }
}