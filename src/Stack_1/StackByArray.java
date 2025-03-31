package Stack_1;

public class StackByArray {
    static int a[];
    static int top;
   public StackByArray(){
        a= new int[100];
        top = -1;
    }
    public static void push(int x){
       if(top==a.length) return;
       top++;
       a[top] = x;
    }
    public static void pop(){
       if(top==-1) return;
       int del = top;
       top--;
        System.out.println(del);
    }
    public static int peek(){
       if(top==-1 || a.length>100) return -1;
       return top;
    }
    public static void main(String[] args) {

    }
}
