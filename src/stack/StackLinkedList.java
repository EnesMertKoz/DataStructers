package stack;

import linkedList.Node;

public class StackLinkedList {

    private Node top;

    public StackLinkedList(){
        this.top = null;
    }
    public void push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

    }
    public int peek(){
        if(top == null){
            System.out.println("liste boştur.");
            return -1;
        }
        int peekedData = top.data;
        return peekedData;


    }
    public int pop(){
        if(top == null){
            System.out.println("liste boştur");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
}
