package LinkedList_2;

class D3Node{
    D3Node next;
    D3Node prev;
    int val;
    int size;
    D3Node(int val){
        this.val = val;
    }
}
public class InsertAtTailNode {
    static int size =0 ;
    public static void Diplay(D3Node head){
        D3Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
            size++;
        }
        System.out.println("size : "+size);
    }
    public static  void insert(int val,D3Node head, D3Node tail){
        D3Node temp = new D3Node(val);
        D3Node samp = head;
        size =0;
        while (samp!=null){
            size++;
            samp = samp.next;
        }
        if(size == 0 ) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    public static void main(String[] args) {
        D3Node a = new D3Node(10);
        D3Node b = new D3Node(20);
        D3Node c = new D3Node(30);
        D3Node d = new D3Node(40);

        a.next = b; b.prev = a;
        b.next = c; c.prev =b;
        c.next = d;  d.next = c;
        Diplay(a);
        insert(23,a,d);
        Diplay(a);
    }
}
