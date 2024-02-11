package LL;

import OOPS.trycatchneed;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}

class DoublyLinkedeList{

    static Node head;
    static Node tail;

    DoublyLinkedeList(){
        this.head = null;
        this.tail = null;
    }

    static void append(int data){
        Node newNode = new Node(data);
        // first node
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void delete(int data){
        Node current = head;
        while (current != null && current.data!=data) {
            current = current.next;
        }
        
        if(current == null){
            System.out.println( "Delete failed, no such key" + data+" present");
            return ;
        }

        // linked to prev node
        if(current.prev != null){
            current.prev.next = current.next;
        }
        else{
            head = current.next;
        }

        // linked to next node
        if(current.next != null){
            current.next.prev= current.prev;
        }
        else{
            tail = current.prev;
        }
    }
    static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
public class DLL {
    
}
