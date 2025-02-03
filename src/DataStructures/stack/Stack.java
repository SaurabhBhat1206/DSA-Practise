package DataStructures.stack;

public class Stack {
    public static void main(String[] args) {
        int n = 5;
        StackExample stackExample = new StackExample(n);
        stackExample.top();
        stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);
        stackExample.push(40);
        stackExample.push(50);
        System.out.println("Top element of the stack: " + stackExample.top());
        stackExample.pop(10);
        stackExample.pop(20);
        stackExample.pop(30);
        stackExample.pop(40);
        stackExample.pop(50);
        System.out.println("Top element of the stack: " + stackExample.top());

    }
}

