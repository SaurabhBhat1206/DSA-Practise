package practise;

import DataStructures.stack.Stack;

public class CustomStack {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        //data[] = {10,20,30,40,50}
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Data in Stack");
        stack.displayStack();
        stack.popStack(50);
        System.out.println("Data after pop");
        System.out.println("Data after pop " + stack.top());
    }
}

class StackImplementation {
    int size;
    public static final int DEFAULT_SIZE = 10;
    int[] data;
    int top = -1;

    StackImplementation(int size) {
        this.size = size;
        this.data = new int[size];
    }

    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            data[++top] = item;
        }
    }

    public boolean isStackEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void displayStack() {
        if (isStackEmpty()) {
            System.out.println("Stack is Empty");
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("Elements in stack are : " + data[i]);
        }
    }

    public void popStack(int item){
        if(!isStackEmpty()){
            data[top] = item;
            top--;
        }
    }
    public int top(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return data[top];
    }
}

