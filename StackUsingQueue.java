import java.util.LinkedList;
import java.util.Queue;
class MyStackDemo{
    Queue<Integer> q1 , q2;
    MyStackDemo(){
        q1 = new LinkedList<>(); // Upcasting
        q2 = new LinkedList<>();
    }
    void push(int val){
        q2.offer(val);
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2  =temp;
    }
    int pop(){
        return q1.poll();
    }
    int getTop(){
        return q1.peek();
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        MyStackDemo stack = new MyStackDemo();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.getTop());
    }
}
