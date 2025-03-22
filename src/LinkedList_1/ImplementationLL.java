package LinkedList_1;
class SLL{
    Node head;
    Node tail;
    int size;
    void AddAtLast(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void Display(){
        Node temp= head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void Size(){
        System.out.println("linked list length is = "+ size);
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.AddAtLast(10);
        list.AddAtLast(-20);
        list.Size();
        list.AddAtLast(30);
        list.AddAtLast(40);
        list.Display();
        list.Size();
    }
}
