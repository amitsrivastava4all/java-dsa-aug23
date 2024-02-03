import java.util.Scanner;

// class <classname> - class declare
// T - Type Template
class Node<T>{
    // Instance Variables (the memory will be allocate once u create the instance (object))
    T data;
    Node<T> next; // Reference to the next node
    // Constructor will be call when u create the object of a class
    // Constructor (to initalize the instance variables of a Node class)
    // Constructor name is same as class name
    // constructor not return any thing even not void
    Node(T data){
        // this keyword - current object refernce
        this.data = data;
        this.next = null;
    }
}
class LinkedListOperations{
    Node<Integer> start = null;
    Scanner scanner = new Scanner(System.in);
    Node<Integer> createNewNode(){
        System.out.println("Enter the data");
        int data = scanner.nextInt();
        Node<Integer> newNode = new Node<Integer>(data);
        return newNode;
    }
    boolean isLLBlank(){
        if(start == null){
            System.out.println("LL is Empty....");
            return true;
        }
        return false;
    }
    void removeAtBeg(){
        if(isLLBlank()){
            return ;
        }
        else{
            Node<Integer> temp = start;
            start = start.next;
            temp.next = null;
            temp = null;
            System.out.println("Remove From Beg Done..");
        }
    }
    void removeAtEnd(){
        if(isLLBlank()){
            return ;
        }
        else{
            Node<Integer> temp = start;
            Node<Integer> temp2 = start;
            while(temp.next!=null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            temp = null;
        }
    }
    void removePosWise(){

    }
    void searchInALL(){

    }
    void updateValueInaLL(){

    }
    void print(){
        Node<Integer> temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void addAtPositionWise(){
      
        Node<Integer> newNode = createNewNode();
        System.out.println("Enter the Position");
        int pos = scanner.nextInt();
        
        if(pos == 1){ // Insertion at Beg
            newNode.next = start;
            start = newNode;
        }
        else{
            int count  = 1;
            Node<Integer> temp = start;
            Node<Integer> temp2 = start;
            while(count<pos){
                temp2 =temp; // prev
                temp = temp.next; // next
                count++;
            }
            temp2.next = newNode;
            newNode.next = temp;
        }

    }
    // Add at beg
    void addAtBeg(){
        Node<Integer> newNode = createNewNode();
        if(start == null){
            start = newNode;

        }
        else{
            
            newNode.next = start;
            start = newNode;

        }

    }
    // Add at End
    void add(){
        
        Node<Integer> newNode = createNewNode();
        if(start == null){
            start = newNode;
        }
        else{
            Node<Integer> temp = start;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next  = newNode;
        }

    }
}
class LinkedListDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Node<Integer> node = new Node<Integer>(10);
        //String x;
        // x is a variable
        // x contains (reference of the string)
        LinkedListOperations opr = new LinkedListOperations();
        while(true){
            System.out.println("1. Add a New Node");
            
            System.out.println("2. Print a LinkedList");
            System.out.println("3. Add at beg");
            System.out.println("4. Add Position Wise");
            System.out.println("0. Exit");
            System.out.println("Enter the Choice...");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    opr.add();
                    break;
                case 2:
                opr.print();
                break;
                case 3:
                opr.addAtBeg();
                break;
                case 4:
                opr.addAtPositionWise();
                break;
                case 0:
                    return ;    
            }

        }
    }
}