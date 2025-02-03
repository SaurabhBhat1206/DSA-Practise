package DataStructures.stack;

public class StackExample {
      int top;
      int[] stackArr;
      int maxSize;

    public StackExample(int size) {
        maxSize = size;
        stackArr = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if(top==maxSize-1){
            System.out.println("Stack overflow");
        }
        stackArr[++top] = value;
        System.out.println(value+ " Pushed into the stack");
    }

    public int pop(int value){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int popElement = stackArr[top--];
        System.out.println(popElement + "Removed from the stack");
        return popElement;
    }

    public int top(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArr[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
}
