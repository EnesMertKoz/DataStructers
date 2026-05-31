package queue;

import linkedList.Node;

public class QueueLinkedList {
    private Node front;
    private Node rear;

    public QueueLinkedList(){
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int dequeue(){
        if(front == null){
            System.out.println("liste boştur");
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;

        if(front==null) rear = null;

        return dequeuedData;

    }
    public int peek(){
        if(front == null){
            System.out.println("liste boştur.");
            return -1;
        }
        return front.data;
    }
}
