package LinkedList_2;

public class ReveserDublyLinkedList {
     static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
        }
    public static void Display(Node head){
        if(head==null){
            return;
        }
        if(head.next == null){
            System.out.println(head.val);
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp= temp.next;
        }
    }
    public static void Revrese(Node head){
         if(head==null || head.next == null){
             System.out.println(head.val);
             return;
         }
         Node dumpy = null;
         Node a = head;
         Node b = head;
         while(b!=null){
             b = a.next;
             dumpy = a.next;
             a = b.prev;

         }

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next  = b; b.prev=a;
        b.next = c; c.prev = b;
        c.next = d ; d.prev = c;
        d.next = e; e.prev =d;
        Display(a);
    }
}
