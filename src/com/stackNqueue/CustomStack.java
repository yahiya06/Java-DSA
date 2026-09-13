package com.stackNqueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr =-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("can not pop from an empty stack");
        }
        int item = data[ptr];
        ptr--;
        return item;
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("stack is empty");
        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
