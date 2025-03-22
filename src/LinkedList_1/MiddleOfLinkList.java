package LinkedList_1;

public class MiddleOfLinkList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e = new Node(50);
//        Node f = new  Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        e.next=f;
        Node temp=a;
        int size=0;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
            size++;
        }
        Node x= a;
        if(size%2==0){
            for(int i=1; i<=(size/2); i++){
                x=x.next;
            }
        }else {
            for(int i=1; i<=size/2; i++){
                x=x.next;
            }
        }
        System.out.println("value is"+ x.val);
    }
}
