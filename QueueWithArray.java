import javax.management.RuntimeErrorException;

class Queue{
    int data[];
    int front;
    int rear;
    int size;
    Queue(int len){
        data = new int[len];
        front = rear = -1;
        size= 0;
    }
    void enqueue(int val){
        if(size == data.length){
            throw new RuntimeException("Queue is Full.... Can't Enqueue");
        }
        if(size ==0){
            front = 0;
            
        }
        rear++; //-1 to 0
        size++;
        if(rear == data.length){
            rear = 0;
        }
       
        data[rear] = val;
    }
    int getFront(){
        if(size == 0){
            throw new RuntimeException("Queue is Empty");
        }
        return data[front];
    }
    int dequeue(){
        if(size==0){
            throw new RuntimeException("Queue is Empty can't dequeue");
        }
        int temp = data[front];
        data[front]=0;
        front++;
        size--;
        if(size ==0){
            front = rear = -1;
        }
        return temp;
    }
    void print(){
        for(int i: data){
            System.out.println(i);
        }
    }
}
public class QueueWithArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front "+queue.getFront());
        queue.print();
       // queue.enqueue(60);
    }
}
