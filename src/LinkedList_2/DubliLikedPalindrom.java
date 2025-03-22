package LinkedList_2;

import javax.swing.plaf.SliderUI;

class  D1Node{
    D1Node next;
    D1Node prev;
    int val;
    D1Node(int val){
        this.val = val;
    }
}

public class DubliLikedPalindrom {
    public static void print(D1Node head){
        D1Node temp = head;
        while(temp!=null){
            System.out.println(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void palindrom(D1Node head, D1Node tail){
        D1Node i = head;
        D1Node j = tail;
        boolean a = true;
        while (i!=null || j!=null){
            if(i.val!=j.val){
                a = false;
                break;
            }
            i = i.next;
            j = j.prev;
        }
        if(a==true){
            System.out.println("palindrom");
        }else{
            System.out.println("notplinfdrom");
        }
    }
    public static void main(String[] args) {
        D1Node a = new D1Node(12);
        D1Node b = new D1Node(12);
        D1Node c = new D1Node(12);
        D1Node d = new D1Node(12);

        a.next = b; b.prev =a;
        b.next =c;  c.prev = b;
        c.next=d; d.prev = c;
        print(a);
        palindrom(a,d);
    }
}
