package Stack_1;

public class Array_By_User {
    public static class Stack{
        int a [] = new int[5];
        int index = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            a[index] = x;
            index++;
        }
        int peek(){
            if(index==0){
                System.out.println("Empty");
                return -1;
            }
            return a[index-1];
        }
        void Display(){
            for (int i = 0; i<index-1; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
        boolean isEmpty(){
            if(index==0)return true;
            return false;
        }
        boolean isFull(){
            if(index==a.length) return true;
            return false;
        }
        int pop(){
            if(index==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = a[index-1];
            a[index-1] = 0;
            index--;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.Display();
        st.pop();
        System.out.println(st.size());
    }
}
