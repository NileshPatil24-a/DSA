package LinkedList_2;
class  D4Node{
    int val;
    D4Node next;
    D4Node(int val){
        this.val = val;
    }
}
public class SCLL {
    public static void Display(D4Node head){
        D4Node temp = head;
        while (true){
            System.out.print(temp.val +" ");
            if(temp.next == head) break;
            temp = temp.next;
        }
        System.out.println();
    }
    public static void insert(int val,D4Node head ,D4Node tail){
        D4Node temp = new D4Node(val);
        temp.next =  head;
        tail = temp;
        head= temp;
    }
    public static void main(String[] args) {
        D4Node a = new D4Node(10);
        D4Node b = new D4Node(20);
        D4Node c = new D4Node(30);
        a.next= b;
        b.next=c;
        c.next=a;
        Display(a);
        insert(2,a,c);
        Display(a);
    }
}
