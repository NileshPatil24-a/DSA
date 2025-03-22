package LinkedList_1;
class SLL2{
    Node head;
    Node tail;
    int size;
    void Head(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void Tail(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=head;
        }else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertatany(int indx,int val){
        Node temp= new Node(val);
        Node x=head;
        if(indx==0){
            Head(val);
            return;
        }
        if(indx==size){
            Tail(val);
            return;
        }
        if(indx>size){
            System.out.println("erro aahe bhau ");
        }
        for(int i=1; i<=indx-1; i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
    }
    void Dispaly(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int Get(int indx){
        if(indx==size-1) return tail.val;
        if(indx>=size || indx<0){
            System.out.println("erro occured");
            return -1;
        }
        Node x = head;
        for(int i =1; i<=indx; i++){
            x=x.next;
        }
        return x.val;
    }
    void set(int indx, int val){

    }
}
public class InsertAtAnyIndex {
    public static void main(String[] args) {
        SLL2 list = new SLL2();
        list.Tail(10);
        list.Tail(20);
        list.Tail(30);
        list.Tail(40);
        list.Tail(50);
        list.Dispaly();
        System.out.println( list.Get(10));
    }
}
