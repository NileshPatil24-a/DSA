public class ReverseLink {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void disply(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void reverse(Node head){
        Node temp = new Node(-1);
        Node a = head;
        while (a!=null){
            temp.next = a;
            a = a.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next=c;
        c.next = d;
        disply(a);
        reverse(a);
        disply(a);
    }
}
