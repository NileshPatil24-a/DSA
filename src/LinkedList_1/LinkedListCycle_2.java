package LinkedList_1;

public class LinkedListCycle_2 {
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f = new Node(60);
        Node g =new Node(70);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=d;
        Node slow = a;
        Node fast = a;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        Node x=a;
        while (x!=slow){
            x=x.next;
        }
        System.out.println(x.val);
    }
}
