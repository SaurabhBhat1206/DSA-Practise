package DataStructures.LinkedList;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;
    private void insertAtLast(int value){
        Node temp = new Node(value);
        if(head==null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    private void print(){
         Node temp = head;
         while(temp!=null){
             System.out.print(" "+ temp.value);
             temp = temp.next;
         }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtLast(10);
        sll.insertAtLast(20);
        sll.insertAtLast(30);
        sll.insertAtLast(40);

        sll.print();
    }
}
