package LL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SwapNodePairs {
    static Node swapPairs(Node head){
        Node  dummy=new Node(0);
        dummy.next=head;

        // Initialize two pointers previous and current
        Node prev = dummy;
        Node current = head;

        // swap logic
        while (current!=null && current.next != null) {
            Node firstNode = current;
            Node secondNode = current.next;

            // swap
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // next two node to be swapped
            prev = firstNode;
            current = firstNode.next;
        }

        return dummy.next;
    }

    
    public static void main(String[] args) {
        SwapNodePairs swapp = new SwapNodePairs();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node current = head;
        System.out.println("Original LL : ");
        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println("Swapped LL : ");
        Node newHead = swapp.swapPairs(head);
        current = newHead;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("NULL");
    }
}
