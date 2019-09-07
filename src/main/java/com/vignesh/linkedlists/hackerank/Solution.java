package com.vignesh.linkedlists.hackerank;

public class Solution {
    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;

        }
    }

    public static void main(String[] args) {
        SinglyLinkedList listNode = new SinglyLinkedList();
        listNode.insertNode(1);
        listNode.insertNode(6);
        listNode.insertNode(3);
        listNode.insertNode(3);
        listNode.insertNode(3);
        listNode.insertNode(4);
        listNode.insertNode(5);
        listNode.insertNode(5);
        printSinglyLinkedList(listNode.head);
        System.out.println(contains(listNode.head, 5));

        removeDuplicates(listNode.head);
        printSinglyLinkedList(listNode.head);
    }

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if ( head == null ) return null;
        SinglyLinkedListNode nextItem = head.next;
        while ( nextItem != null && head.data == nextItem.data ) {
            nextItem = nextItem.next;
        }
        head.next = removeDuplicates( nextItem );
        return head;
    }

    static boolean contains(SinglyLinkedListNode node, int value) {
        while (node != null) {
            if (node.data == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

}
