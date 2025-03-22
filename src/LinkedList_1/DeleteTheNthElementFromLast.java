package LinkedList_1;

public class DeleteTheNthElementFromLast {
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
        int index=3;
        int size=0;
        Node temp =a;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        Node x=a;
        for(int i=1; i<=size-index-1; i++){
            x=x.next;
        }
        x.next=x.next.next;
        temp=a;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
