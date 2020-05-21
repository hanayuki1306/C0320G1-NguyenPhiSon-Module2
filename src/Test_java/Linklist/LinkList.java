package Test_java.Linklist;

import collections.MyLinkedList;
import org.w3c.dom.CDATASection;

public class LinkList {
//    private LinkList.Node head;
    private int size;
    private Node head;
    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public LinkList(Object data){
        this.head = new Node(data);
        size++;
    }

    public void add(Object data){
        Node pointer = head;
        for(int i = 0 ; i < size - 1 ;i++) {
            pointer = pointer.next;
        }

        Node newNode = new Node(data);
        pointer.next = newNode;
        size++;
    }
    public void printList() {
        Node pointer = head;

        while(pointer != null) {
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }


}
