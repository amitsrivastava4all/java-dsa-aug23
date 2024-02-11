package LL;

import java.util.HashMap;

class Node{
    int key;
    int data;
    Node prev;
    Node  next; 
    
    public Node(int key , int d){
        this.key = key;
        this.data = d;
        prev=null; 
        next= null;
    }
}
public class LRUCache {
    private final int capacity;
    private final HashMap<Integer,Node> cache;
    private final Node head;
    private final Node tail;

    public LRUCache(int cap) {
        this.capacity = cap;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        // Return the value of the key if it exists in the cache, otherwise return -1.
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        removeNode(node);
        addToHead(node);

        return node.data;
    }

    public void put(int  key, int value) {
        // If the key already exists in the cache then update it to be the most recently used one
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.data = value;
            removeNode(node);
            addToHead(node);
        }else{
            if(cache.size() == capacity){
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            Node node = new Node(key, value);
            cache.put(key, node);
            addToHead(node);
        }
    }

    private void removeNode(Node  node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node){
        node.next = head.next;
       node.prev = head;
       head.next.prev = node;
       head.next = node;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 1);
        System.out.println(lruCache.get(1));   // returns 1
    }
}
