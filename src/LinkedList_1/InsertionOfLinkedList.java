package LinkedList_1;

public class InsertionOfLinkedList {
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
        Node head= a;
        int lenA= 0;
        Node tempA = head;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        int lenB=0;
        Node tempB = head;
        while (tempB!=null){
            tempB=tempB.next;
            lenB++;
        }
         tempA=head;
         tempB=head;
         if(lenA>lenB){
             for(int i=1; i<=lenA-lenB; i++){
                 tempA = tempA.next;
             }
         }else {
             for(int i=1; i<=lenB-lenA; i++){
                 tempB = tempB.next;
             }
         }
         while (tempA!=tempB){
             tempA = tempA.next;
             tempB = tempB.next;
         }
        System.out.println(tempB.val);
    }
}
