package LinkedList_1;
class SLL1{
    Node head;
    Node tail;
    void beging(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    void last(int val){
        Node temp= new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void dispay(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class InsertAtBegining {
    public static void main(String[] args) {
        SLL1  list = new SLL1();
        list.beging(10);
        list.last(20);
        list.dispay();
        list.beging(30);
        list.dispay();
    }
}
