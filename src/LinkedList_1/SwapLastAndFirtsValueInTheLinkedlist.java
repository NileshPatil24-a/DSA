package LinkedList_1;

public class SwapLastAndFirtsValueInTheLinkedlist {
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b = new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int n=2;
        Node head= a;
        Node slow= head;
        Node fast = head;
        for(int i=1; i<=n-1; i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        int firts = fast.val;
        int temp = slow.val;
        slow.val = firts;
        firts = temp;
        Node x=head;
        while(x!=null){
            System.out.println(x.val);
            x=x.next;
        }
    }
}
