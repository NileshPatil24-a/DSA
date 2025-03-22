package LinkedList_1;

public class DeleteTheMiddleOfLinkeList {
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
        f.next=g;
        Node temp=a;
        Node slow=a;
        Node fast=a;
        int size=0;
        while (fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            size++;
        }
//        System.out.println(slow.val);
        slow.next=slow.next.next;
//        System.out.println(slow.val);
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
