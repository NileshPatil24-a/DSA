package Stack_1;

public class StackByLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head =  null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void Dispaly(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {

    }
}
