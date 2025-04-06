package QueuesDataStructure;

public class ArrayImpelemataion {
    static  class Queue{
        int a  [] = new int[5];
        int front = -1;
        int rear = -1;
        int size =0;
        void add(int x){
            if(front==-1 && rear==-1){
                front++;
                rear++;
            }else{
                rear = (rear+1)%a.length;
            }
            a[rear] = x;
        }
        void remove(){
            if(front==-1 && rear==-1) return;
            else{
                
            }
        }
    }
    public static void main(String[] args) {

    }
}
