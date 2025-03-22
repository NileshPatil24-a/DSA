package LinkedList_2;

import java.util.Dictionary;

class D2Node{
    int val;
    D2Node next;
    D2Node prev;
    int size;
    D2Node(int val){
        this.val = val;
    }
}
public class Operations {
    public static void Display(D2Node head){
        int size=0;
        D2Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
            size++;
        }
        System.out.println();
    }
    public static void insertAtTail(int val){
        D2Node temp = new D2Node(val);
    }
    public static void main(String[] args) {
        D2Node a = new D2Node(10);
        D2Node b = new D2Node(20);
        D2Node c = new D2Node(30);
        D2Node e = new D2Node(40);
        a.next = b; b.prev = a;
        b.next = c; c.prev =b;
        c.next = e; e.prev = c;
        Display(a);
    }
}
