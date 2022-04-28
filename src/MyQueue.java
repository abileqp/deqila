package com.company;
import java.util.*;

public class MyQueue<T> {
    LinkedList<T> myQueue = new LinkedList<>();

    public boolean empty(){
        boolean x = false;
        if(myQueue.size() == 0){
            x = true;
        }
        return x;
    }

    public int size(){
        return myQueue.size();
    }
    public T enqueue(T newItem){
        myQueue.addLast(newItem);
        return newItem;
    }

    public T dequeue(){
        return myQueue.removeFirst();
    }
    public T peek(){
        return myQueue.getFirst();
    }
}