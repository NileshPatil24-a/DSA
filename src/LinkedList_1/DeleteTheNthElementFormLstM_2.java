package LinkedList_1;

public class DeleteTheNthElementFormLstM_2 {
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
        Node head=a;
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        int n=2;
        Node slow=head;
        Node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        temp =head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
