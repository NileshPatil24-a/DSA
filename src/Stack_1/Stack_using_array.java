package Stack_1;

public class Stack_using_array {
    static int top = -1;
    static int capacity  =  5;
    static int a [] = new int[capacity];
    static  int size = 0;
    public  static  void push(int num){
        if(top==capacity){
            System.out.println("stack is full ");
            return;
        }
        top++;
        size++;
        a[top] = num;
    }
    public static void pop(){
        if(top==-1){
            System.out.println("stack is empty ");
            return;
        }
        top--;
        size--;
    }
    public static int peek(){
        if(top==-1){
            return  -1;
        }
        else{
            return a[top];
        }
    }
    public static void print(){
        if(top==-1){
            System.out.println("sorry stack is empty");
            return;
        }
        else{
            for(int ele : a){
                System.out.print(ele +" ");
            }
        }
    }
    public static boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    public static void main(String[] args) {
        push(2);
        push(30);
        push(40);
        push(40);
        print();
        System.out.println(peek());
        System.out.println(size);
        System.out.println(isEmpty());
        pop();
        pop();
        pop();
        pop();
        System.out.println(isEmpty());
        //  peek();
        // pop();
        // size();
    }
}
