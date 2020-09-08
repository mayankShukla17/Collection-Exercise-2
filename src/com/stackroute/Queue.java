package com.stackroute;
//Implement Queue Programmatically
public class Queue {
    Object object[];
    int capacity,front,rear;

    public Queue(int capacity) {
        this.capacity = capacity;
        object=new Object[capacity];
        front=rear=-1;
    }

    //Method for adding elements in queue
    public boolean enQueue(Object element){
        if (rear==capacity-1){
            System.out.println("Queue is full");
            return false;
        }
        if (rear==-1)
            front++;
        object[++rear]=element;
        return true;
    }

    //Method for deleting elements from queue
    public Object deQueue(){
        if (front==-1){
            System.out.println("Queue is empty");
            return null;
        }
        Object output=object[front++];
        if (front>rear)
            front=rear=-1;
        return output;
    }

    //Method for printing the output of Queue
    public String toString(){
        String string="[";
        for (int i=front;i<=rear&&front!=-1;i++){
            string=string+object[i];
            if (i<rear)
                string=string+",";
        }
        return string+"]";
    }

    //Method for checking the size
    public int size(){
        if (front==-1)
            return 0;
        return rear-front+1;
    }
}
