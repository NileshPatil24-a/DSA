package LinkedList_2;
class  DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}
public class DublieLinkedList {
    public static  void print(DNode head){
        DNode temp = head;
        while(temp.next!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public  static void revrese(DNode tail){
        DNode temp = tail;
        while (temp.prev!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void dispay(DNode node){
        DNode temp = node;
        while (temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
        System.out.println();
    }
    public static void main(String[] args) {
        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(30);
        DNode d = new DNode(40);

        a.next = b ; b.prev = a;
        b.next = c ; c.prev = b;
        c.next = d; d.prev = c;

        print(a);
        revrese(d);
        dispay(c);
    }
}
