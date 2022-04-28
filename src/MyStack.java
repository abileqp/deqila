package com.company;
import java.util.*;

public class MyStack<T> {
    LinkedList<T> myStack = new LinkedList<>();

    public T push(T newItem){
        myStack.addLast(newItem);
        return newItem;
    }

    public boolean empty(){
        boolean x = false;
        if(myStack.size() == 0){
            x = true;
        }
        return x;
    }
    public T pop(){
        return myStack.remove(myStack.size()-1);
    }

    public T peek() {
        return myStack.get(myStack.size()-1);
    }

    public int size(){
        return myStack.size();
    }
}