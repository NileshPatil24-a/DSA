package QueuesDataStructure;

public class LinkedList_1 {
    static class Node{
        int val;
        Node  next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class Queue{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int x){
            Node temp = new Node(x);
            if(size==0){
                tail=head=temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void peek(){
            System.out.println(head.val);
        }
        void remove(){
            if(size==0){
                return;
            }else{
                head = head.next;
            }
            size--;
        }
    }
    public static void main(String[] args) {

    }
}
