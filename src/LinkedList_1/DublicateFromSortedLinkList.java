package LinkedList_1;

public class DublicateFromSortedLinkList {
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
        Node low = a;
        Node high = a;
        if(a==null){
            System.out.println("null he ");
        }
        while (high!=null){
            if(low.val==high.val){
                high= high.next;
            }else {
                low.next = high;
                low=high;
            }
        }
        low.next=null;
        Node temp =a;
        while (temp!=null){
            System.out.println(a.val);
            temp=temp.next;
        }
    }
}
