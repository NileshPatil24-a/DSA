package LinkedList_1;
class Node{
    int val;
    Node next;
    Node (int val){
        this.val= val;
    }

}

public class ShallowCopyNode {
    public static void Dispay(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void Recursive(Node head){
        Node temp=head;
        if(temp==null) return;
        Recursive(temp.next);
        System.out.println(temp.val);
    }
    public static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(40);
        Node c= new Node(50);
        Node e= new Node(60);
        a.next=b;
        b.next=c;
        c.next=e;
        Dispay(a);
        Recursive(a);
    }
}
