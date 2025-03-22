package Stack_1;

public class Linked_list_Implemeanation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int Size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("Empty");
                return -1;

            }
            int x = head.val;
            head = head.next;
            size --;
            return  x;
        }
        void peek(){
            if(head == null){
                System.out.println("Stack empty");
                return;
            }
            System.out.println(head.val);
        }
        boolean isEmpty(){
            if(head==null) return true;
            return false;
        }
        void Display(){
            Displayrec(head);
        }
        void Displayrec(Node h){
            if(h==null){
                return;
            }
            Displayrec(h.next);
            System.out.println(h.val);
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
    }
}
